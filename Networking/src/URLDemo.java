import java.net.URL;


public class URLDemo
{
 public static void main(String[] args) throws Exception
{
	 URL url=new URL("https://www.google.com/niket/index.jsp");
	 System.out.println("protocol:"+url.getProtocol());
	 System.out.println("HostName:"+url.getHost());
	 System.out.println("portNumber:"+url.getPort());
	 System.out.println("FileName:"+url.getFile());
	 
}
}
