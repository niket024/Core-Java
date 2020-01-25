
import java.io.Console;
import java.io.DataInputStream;

public class Password
{
	 public static void main(String args[])throws Exception{
	        System.out.println("Enter the username");
	        String username = new DataInputStream(System.in).readLine();
	         
	        System.out.println("Enter the password");
	        Console console = System.console();
	        char[] password = console.readPassword();
	         
	        System.out.println("Username: "+username);
	        System.out.println("Password: "+String.valueOf(password));
	    }
}
