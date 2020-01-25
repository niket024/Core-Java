public class Manager
{
	public static void main(String[] args)
	{
		H h1= new H(){
			@Override
			void test()
			{
				System.out.println("test");
				
			}
		};
		h1.test();
	}
	I i1 = new I(){

		@Override
		public void test1()
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void test2()
		{
			// TODO Auto-generated method stub
			
		}
		
	};
}
