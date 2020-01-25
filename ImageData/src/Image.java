import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class Image
{
public static void main(String[] args)
{
	 try
	  {
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  }
	  catch(ClassNotFoundException ex)
	  {
	  ex.printStackTrace();
	  }
	  
	  Connection con=null;
	  java.sql.Statement stmt=null;
	
	  try
	  {
	  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","great123");
	  stmt=con.createStatement();
	  rs=stmt.executeQuery(sql);
	  status=rs.next();
	  }
	  catch(SQLException ex)
	  {
		  ex.printStackTrace();
	  }
	  finally
	  {
		  try
		  {
			  if(rs!=null)
			  {
				  rs.close();
				  rs=null;
			  }
		 }
		  catch(SQLException ex)
		  {
			  ex.printStackTrace();
		  }
		  try
		  {
			  if(stmt!=null)
			  {
				  stmt.close();
				  stmt=null;
			  }
		 }
		  catch(SQLException ex)
		  {
			  ex.printStackTrace();
		  }
		  try
		  {
			  if(con!=null)
			  {
				  con.close();
				  con=null;
			  }
		  }
		  catch(SQLException ex)
		  {
			  ex.printStackTrace();
		  }
}
}
