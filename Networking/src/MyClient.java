import java.io.DataOutputStream;
import java.net.Socket;


public class MyClient
{
  public static void main(String[] args)
{
	 try
	 {
		 Socket s=new Socket("localhost",3333);
		 DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		 dout.writeUTF("hello Server");
		 dout.flush();
		 dout.close();
	 }
	 catch(Exception ex)
	 {
		 ex.printStackTrace();
	 }
	 System.out.println("done");
}
}
