package test;
import java.io.FileNotFoundException;
import java.io.IOException;
class Building {  
	void color() throws IOException
	{
		  System.out.println("Blue");
	}  
}
//Overrided method can have wider or similar assess modifiers but child or same exception class  
class Room extends Building{
	  public void color() throws FileNotFoundException
	  {
		  System.out.println("White");
	  }  
	  public static void main(String args[]){  
		   Building obj = new Room();  
		   try{
		   obj.color();
		   }catch(Exception e){
			   System.out.println(e);
		   }
	  } 
}