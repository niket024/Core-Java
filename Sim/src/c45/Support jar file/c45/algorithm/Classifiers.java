/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package c45.algorithm;

import c45.preprocess.Utils;
import c45.preprocess.Instance;
import c45.preprocess.FastVector;
import c45.preprocess.OptionHandler;
import c45.preprocess.Instances;
import c45.preprocess.SerializedObject;
import c45.preprocess.Attribute;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */

public class Classifiers {
    
 /** The main set of instances we're playing with */
  protected Instances m_Instances;

  public static String tree="";

   /** A thread that classification runs in */
  protected Thread m_RunThread;

   /** The user-supplied test set (if any) */
  protected Instances m_TestInstances;

   /** Lets the user configure the classifier */
  protected GenericObjectEditor m_ClassifierEditor = new GenericObjectEditor();

   /**
   * Tells the panel to use a new set of instances.
   *
   * @param inst a set of Instances
   */
  public void setInstances(Instances inst) {

    m_Instances = inst;

    String [] attribNames = new String [m_Instances.numAttributes()];
    for (int i = 0; i < attribNames.length; i++) {
      String type = "";
      switch (m_Instances.attribute(i).type()) {
      case Attribute.NOMINAL:
	type = "(Nom) ";
	break;
      case Attribute.NUMERIC:
	type = "(Num) ";
	break;
      case Attribute.STRING:
	type = "(Str) ";
	break;
      case Attribute.DATE:
	type = "(Dat) ";
	break;
      default:
	type = "(???) ";
      }
      attribNames[i] = type + m_Instances.attribute(i).name();
    }
  
  }



    /**
   * Starts running the currently configured classifier with the current
   * settings. This is run in a separate thread, and will only start if
   * there is no classifier already running. The classifier output is sent
   * to the results history panel.
   */
  public void startClassifier(final Instances  m_Instances) {

    if (m_RunThread == null) {
    /*  synchronized (this) {
	//m_StartBut.setEnabled(false);
	//m_StopBut.setEnabled(true);
      }*/

        this.m_Instances= m_Instances;
      m_RunThread = new Thread() {
	public void run() {
	  // Copy the current state of things
	  System.out.println("Setting up...");
	  CostMatrix costMatrix = null;
	  Instances inst = new Instances(m_Instances);
	  Instances userTest = null;
	  // additional vis info (either shape type or point size)
	  FastVector plotShape = new FastVector();
	  FastVector plotSize = new FastVector();
	  Instances predInstances = null;
          m_ClassifierEditor.setClassType(Classifier.class);
          m_ClassifierEditor.setValue(new c45.algorithm.binary.C4());
  
         
          // will hold the prediction objects if the class is nominal
          FastVector predictions = null;          
          // for timing
	  long trainTimeStart = 0, trainTimeElapsed = 0;

	  if (m_TestInstances != null) {
	    userTest = new Instances(m_TestInstances);
	  }
	
	  boolean outputModel = true;
	  boolean outputConfusion = true;
	  boolean outputPerClass = true;
	  boolean outputSummary = true;
          boolean outputEntropy = true;
	  boolean saveVis = true;
	  boolean outputPredictionsText = true;

	  String grph = null;

	  int testMode = 0;
	  int numFolds = 10, percent = 66;
         
          Classifier classifier = (Classifier) m_ClassifierEditor.getValue();
          Classifier template = null;
	  try {
	    template = Classifier.makeCopy(classifier);
	  } catch (Exception ex) {
	    System.out.println("Problem copying classifier: " + ex.getMessage());
	  }
	
	  Classifier fullClassifier = null;
	  StringBuffer outBuff = new StringBuffer();
	  String name = (new SimpleDateFormat("HH:mm:ss - ")).format(new Date());
          try {

              String cname = classifier.getClass().getName();
        
          }catch(Exception e){
               System.out.println("error"+e.toString());
          }
	
	  try {
	  
	      testMode = 3;

              inst.setClassIndex(12);
	    if (inst.classAttribute().isNominal()) {
	      predictions = new FastVector();
	    }
	
	    outBuff.append("=== Run information ===\n\n");
	    if (classifier instanceof OptionHandler) {
	      String [] o = ((OptionHandler) classifier).getOptions();
	      outBuff.append(" " + Utils.joinOptions(o));
	    }
	    outBuff.append("\n");
	    outBuff.append("Relation:     " + inst.relationName() + '\n');
	    outBuff.append("Instances:    " + inst.numInstances() + '\n');
	    outBuff.append("Attributes:   " + inst.numAttributes() + '\n');
	    if (inst.numAttributes() < 100) {
	      for (int i = 0; i < inst.numAttributes(); i++) {
		outBuff.append("              " + inst.attribute(i).name()
			       + '\n');
	      }
	    } else {
	      outBuff.append("             [list of attributes omitted]\n");
	    }

	    outBuff.append("Test mode:    ");
	    switch (testMode) {
	      case 3: // Test on training
	      outBuff.append("evaluate on training data\n");
	      break;
	      case 1: // CV mode
	      outBuff.append("" + numFolds + "-fold cross-validation\n");
	      break;
	      case 2: // Percent split
	      outBuff.append("split " + percent
			       + "% train, remainder test\n");
	      break;
	      case 4: // Test on user split
	      outBuff.append("user supplied test set: "
			     + userTest.numInstances() + " instances\n");
	      break;
	    }
            if (costMatrix != null) {
               outBuff.append("Evaluation cost matrix:\n")
               .append(costMatrix.toString()).append("\n");
            }
	    outBuff.append("\n");

         /////////////////  // m_History.addResult(name, outBuff);
        ///////////////////////  /////////////////m_History.setSingle(name);

	    // Build the model and output it.
	    if (outputModel || (testMode == 3) || (testMode == 4)) {
	      System.out.println("Building model on training data...");

	      trainTimeStart = System.currentTimeMillis();
             classifier.buildClassifier(inst);
           //  System.out.println("dfd"+classifier.toString());
	      trainTimeElapsed = System.currentTimeMillis() - trainTimeStart;


	    }

	    if (outputModel) {
	      outBuff.append("=== Classifier model (full training set) ===\n\n");
	      outBuff.append(classifier.toString() + "\n");
	      outBuff.append("\nTime taken to build model: " +
			     Utils.doubleToString(trainTimeElapsed / 1000.0,2)
			     + " seconds\n\n");

              setTree(classifier.toString());



	    }

	    } catch (Exception ex) {
	      ex.printStackTrace();
	    }

	 
        }

                private void setTree(String toString) {
                   tree =toString;
                }
	//}
      };
      m_RunThread.setPriority(Thread.MIN_PRIORITY);
      m_RunThread.start();
    
  }
}

  protected String predictionText(Classifier classifier, Instance inst, int instNum) throws Exception {

    //> inst#   actual   predicted   error  probability distribution

    StringBuffer text = new StringBuffer();
    // inst #
    text.append(Utils.padLeft("" + instNum, 6) + " ");
    if (inst.classAttribute().isNominal()) {

      // actual
      if (inst.classIsMissing()) text.append(Utils.padLeft("?", 10) + " ");
      else text.append(Utils.padLeft("" + ((int) inst.classValue()+1) + ":"
				+ inst.stringValue(inst.classAttribute()), 10) + " ");

      // predicted
      double[] probdist = null;
      double pred;
      if (inst.classAttribute().isNominal()) {
	probdist = classifier.distributionForInstance(inst);
	pred = (double) Utils.maxIndex(probdist);
	if (probdist[(int) pred] <= 0.0) pred = Instance.missingValue();
      } else {
	pred = classifier.classifyInstance(inst);
      }
      text.append(Utils.padLeft((Instance.isMissingValue(pred) ? "?" :
				 (((int) pred+1) + ":"
				 + inst.classAttribute().value((int) pred))), 10) + " ");
      // error
      if (pred == inst.classValue()) text.append(Utils.padLeft(" ", 6) + " ");
      else text.append(Utils.padLeft("+", 6) + " ");

      // prob dist
      if (inst.classAttribute().type() == Attribute.NOMINAL) {
	for (int i=0; i<probdist.length; i++) {
	  if (i == (int) pred) text.append(" *");
	  else text.append("  ");
	  text.append(Utils.doubleToString(probdist[i], 5, 3));
	}
      }
    } else {

      // actual
      if (inst.classIsMissing()) text.append(Utils.padLeft("?", 10) + " ");
      else text.append(Utils.doubleToString(inst.classValue(), 10, 3) + " ");

      // predicted
      double pred = classifier.classifyInstance(inst);
      if (Instance.isMissingValue(pred)) text.append(Utils.padLeft("?", 10) + " ");
      else text.append(Utils.doubleToString(pred, 10, 3) + " ");

      // err
      if (!inst.classIsMissing() && !Instance.isMissingValue(pred))
	text.append(Utils.doubleToString(pred - inst.classValue(), 10, 3));
    }
    text.append("\n");
    return text.toString();
  }   

}
