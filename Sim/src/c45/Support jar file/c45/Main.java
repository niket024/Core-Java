 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package c45;

import c45.algorithm.Classifiers;
import c45.preprocess.Instances;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import c45.packet.*;
import java.sql.SQLException;

/**
 *
 * @author brindha
 */
public class Main {
    Instances  m_Instances;
    Classifiers  dd ;
  public static Map packetdata ;

  Main()
  {
    dd = new Classifiers();
    packetdata = new Hashtable();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Main main = new Main();             
            main.read();
           // Main.packetProcess();
            // TODO code application logic here
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }   

        // TODO code application logic here
    }

    void read () throws IOException{
        Reader r = null;
        try {           
            String url = "c:\\dataset1.arff";
            File file = new File(url);
            r = new BufferedReader(new FileReader(file));
            setInstances(new Instances(r));
            dd.startClassifier(getInstances());
             Runnable r1 = new Runnable() {

			public void run() {
                              System.out.println("dsf");
				PacketSniffer sniffer = new PacketSniffer();
                                  System.out.println("dsf");
                    try {
                        sniffer.startCapture();
                          System.out.println("dsf");
                    } catch (SQLException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
			}
		};
                	Thread th1 = new Thread(r1);
		th1.start();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            r.close();
        }        
    }


   public void setInstances(Instances inst) {
    m_Instances = inst;
    System.out.println(m_Instances.relationName());
    System.out.println(m_Instances.numInstances());
   }

    /**
   * Gets the working set of instances.
   *
   * @return the working instances
   */
  public Instances getInstances() {

    return m_Instances;
  }


 

}
