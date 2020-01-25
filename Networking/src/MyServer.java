import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class MyServer
{
public static void main(String[] args)
{
	try
	{
		ServerSocket ss=new ServerSocket(3333);
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String s1=(String)dis.readUTF();
		System.out.println("msg="+s1);
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
}
}
