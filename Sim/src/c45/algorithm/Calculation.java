/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author admin
 */
public class Calculation {

    Map packetdata1;
    int c=5;
	String strLine= null;
    StringTokenizer str = null;
    String token =null,currentToken=null;
	boolean iteration=true;
	int lineNo=5,tokenCount=0,lineCount=0;
	Vector setTokens=null;
    Calculation(){

            packetdata1 = new Hashtable();
            packetdata1.put("duration", "0");
            packetdata1.put("protocol_type", "n");
            packetdata1.put("service", "n");
            packetdata1.put("flag", "n");
            packetdata1.put("src_bytes", "0");
            packetdata1.put("dst_bytes", "0");
            packetdata1.put("land", "n");
            packetdata1.put("wrong_fragment", "0");
            packetdata1.put("urgent", "0");         
            packetdata1.put("is_host_login", "n");
            packetdata1.put("is_guest_login", "n");
            packetdata1.put("count", "0");
 
			ReadRule();
    }


private	String getToken(String currentLine,int tokenIndex)
	{
          
          str = new StringTokenizer(currentLine);
          setTokens=new Vector();

          while(str.hasMoreTokens())
          {
        	String temp =str.nextToken();
            setTokens.addElement(temp);
          }
		  //System.out.println("Vector contains "+setTokens);
          token =(String)setTokens.elementAt(tokenIndex);
		  //System.out.println("inside getToken()  " + token);
		  return token;
	}
 private int findEquivalentToken(String keyToken,int lineNo)
	{
	 boolean b=true;
	 while(b){
	 StringTokenizer st=new StringTokenizer(readFile(lineNo));
	 System.out.println("Inside Equivalent token() --"+lineNo);
     //Vector allTokens=new Vector();
	 while(st.hasMoreTokens())
          {
		    String temp =st.nextToken();
		    if(keyToken.equals(temp))
			  {
				System.out.println("Equivalent token is found--"+temp+" in line  "+lineNo);
				b=false;
				break;
			  }
        	
           }
		  lineNo++;
	 }//End of Main while
     return lineNo;
}

	private String ReadRule(Hashtable packetdata){
      String result="normal";
        try {
           String url ="c4rule.txt";
           int count =5;
		   int j=0;
          
           //while (iteration) {
           while (j<5) {
           strLine= readFile(lineNo);
           //StringTokenizer str = new StringTokenizer(strLine);
           //String first_token =str.nextToken();
		   System.out.println("Token count-->"+ tokenCount);
           currentToken=getToken(strLine,tokenCount);
		   System.out.println("Current Tok-->"+ currentToken);
           boolean temp=isNominal(currentToken);
		   //temp=true;  		    

           if(temp){  //************** For Nominal Attributes***************************  
           
           // boolean isNomOpt=isNominalOperator(getToken(strLine,1),"a","b");
		   boolean isNomOpt=isNominalOperator("=","a","a");

		   if(isNomOpt)
			   {
						  //boolean finalResult=isResult(getToken(strLine,2));
						  boolean finalResult=isResult("168:");

						  if(finalResult){
                          System.out.println("The Result is  "+getToken(strLine,4));
						  break;
						  }
						  else
				         {
						  lineNo++;
						  tokenCount++;
                          //strLine=readFile(lineNo);
						  //currentToken=getToken(strLine,tokenCount);
						  System.out.println("next Token" + currentToken);
        		         }
			}
            else{
				System.out.println();
			
			}
		            System.out.println("Current Tok is nominal"+ isNomOpt);
             break;
         }
		   else {     //************** For Numerical Attributes***************************   
			           
		                tokenCount++;
						//System.out.println("Current Tok is numerical-->"+ currentToken+"  strline "+strLine);
                        //boolean isNumOpt= isNumericalOperator(Cont_token,i,Integer.parseInt(getToken(strLine,4)));
						System.out.println("Numerical token 1 " + getToken(strLine,tokenCount));
						System.out.println("Numerical packetValue  " + Float.parseFloat(packetdata.get(currentToken).toString()));
						//System.out.println("Numerical c4 Value  " + Float.parseFloat(getToken(strLine,tokenCount+1)));
						
						
                        

						 boolean finalResult=isResult(getToken(strLine,tokenCount));

                          if(finalResult){
                          System.out.println("The Result is  "+getToken(strLine,4));
						  break;
						  }
						  else{
							  System.out.println("not final");
						  boolean isNumOpt= isNumericalOperator(getToken(strLine,tokenCount),Float.parseFloat(Main.packetdata.get(currentToken).toString()),Float.parseFloat(getToken(strLine,tokenCount+1)));
						  System.out.println("isNumericalOperator result--"+isNumOpt);
						  if(isNumOpt)
			                    {
						          tokenCount++;
						       	  lineNo++;
						          lineCount++;
           						  tokenCount=lineCount;
			        			  //strLine=readFile(lineNo);
					        	  //currentToken=getToken(strLine,tokenCount);
						          // System.out.println("next Token" + currentToken);
        		                  }
						       
                         else{
                         //lineCount++;
        	             //tokenCount=lineCount;
			             //while(true){
			             lineNo++;
			             lineNo=findEquivalentToken(currentToken,lineNo);
			             //break;
			   // }       
			              }
			              System.out.println("Condition if False "+tokenCount);
			
			              }
          System.out.println("----------------------------------------------------------------------------");
         //break;
        } //End of else 
				 
 }//End of while..
}
        catch (Exception ex) {
            Logger.getLogger(Calculation.class.getName()).log(Level.SEVERE, null, ex);
        }
      return result;

    }
	
   boolean isNominal(String attr) {       
      String temp= (String) packetdata1.get(attr);
      if(temp.equals("n")) {
		  return true;
      }else {
          return false;
      }     
   }

   boolean isNumericalOperator(String a1,float packetValue, float c4Value){
       boolean result= false;
       if(a1.equals("<=")){
           if(packetValue <= c4Value){
              result= true;
           }else {
               result= false;
           }
       }else if(a1.equals(">=")) {
           if(packetValue <= c4Value){
               result= true;
           }else {
               result= false;
           }
          
       }else if(a1.equals("==")) {
           if(packetValue <= c4Value){
               result= true;
           }else {
               result= false;
           }
          
       }else if(a1.equals(">")){
           if(packetValue <= c4Value){
               result= true;
           }else {
               result= false;
           }
         
       }else if(a1.equals("<")){
           if(packetValue <= c4Value){
               result= true;
           }else {
               result= false;
           }
           
       }else if(a1.equals("!=")){
           if(packetValue <= c4Value){
               result= true; 
           }else {
               result= false;
           }      
       }
       return result;
   }

   boolean isNominalOperator(String a1,String a, String b){
       boolean result= false;
       if(a1.equals("=")){
           if(a.equals(b)){
              result= true;
           }else {
               result= false;
           }
       }else if(a1.equals("!=")) {
           if(a.equals(b)){
               result= true;
           }else {
               result= false;
           }
	   }
		 return result;
  
   }
  boolean isResult(String str) {
      int i =str.indexOf(":");

      if(i!=-1){
          return true;
      }
      return false;

  }
  private String readFile(int count) {
        try {
           //String url ="Classifiers";
           String strLine;
           int count_temp =0;          
           BufferedReader br = new BufferedReader(Classifiers.tree);
		  // System.out.println("Readed Line is --->"+ count);
           while ((strLine = br.readLine()) != null) {
               count_temp++;
               if(count_temp==count){ 	
				   return strLine;				  
                }           
            }

       } catch (IOException ex) {
            Logger.getLogger(Calculation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "string";

   }

}
