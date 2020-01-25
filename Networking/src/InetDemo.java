import java.net.InetAddress;


public class InetDemo
{
 public static void main(String[] args) throws Exception
{
	 
	InetAddress ip=InetAddress.getByName("localhost");
	System.out.println("host name:"+ip.getHostName());
	System.out.println("Host Address:"+ip.getHostAddress());
	System.out.println("done");
}
}
