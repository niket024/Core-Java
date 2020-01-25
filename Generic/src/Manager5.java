class H<A>
{

}

public class Manager5
{
	public static void main(String[] args)
	{
		H<? super Number> h1=null;
		h1=new H<Number>();
		h1=new H<Object>();
		//h1=new H<Integer>();
//		h1=new H<String>();
		
		
		System.out.println("done");
	}
}
