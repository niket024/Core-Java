package c45.database;

import java.sql.*;
import java.util.*;


public class Database  {

  	private static String  jdbcDriver = "";
  	private static String  dbURL = "";
	private static String  username = "";
	private static String  password = "";

	private Connection connection;

       // Connection con;
   Statement st;
   ResultSet rs;


  	public Database() throws SQLException, ClassNotFoundException
  	{



         // ResourceBundle bundle = ResourceBundle.getBundle("Database");

		  jdbcDriver = "com.mysql.jdbc.Driver";
		  dbURL =  "jdbc:mysql://localhost:3306/ids";
		  username = "root";
		  password = "password";


    	 Class.forName(jdbcDriver); //set Java database connectivity driver

    	 connection = DriverManager.getConnection(dbURL, username, password);

	}

	/*public ResultSet executeQuery(String query)throws SQLException
	{
	    PreparedStatement st  = connection.prepareStatement(query);
	    return st.executeQuery();
	}*/

	public int executeUpdate(String statement)throws SQLException
	{
		PreparedStatement st  = connection.prepareStatement(statement);
	    return st.executeUpdate();
	}

	public int executeUpdate1(String attack ) {
             int i =0;
		  try
     {
       st = connection.createStatement();
        i = st.executeUpdate("insert into alertlog (date,message,action) values (now(),'"+attack+"Attack Found','alert');");
	    // rd= req.getRequestDispatcher("success.jsp");
		// rd.forward(req,res);


     } catch (SQLException s)
      {
        System.out.println("SQL statement is not executed!");
       }
             return i;
	}

	public void close()
	{
		try
	    {
			connection.close();
		}
	    catch (SQLException sqlException)
	    {
			sqlException.printStackTrace();
	    	connection = null;
	    }
	}
	protected void finalize()
	{
		close();
	}
}