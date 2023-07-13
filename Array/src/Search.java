public class Search
{
	public static void main(String[] args)
	{
		// Linear search
		// 1,2,3,4,5,6,7,8
	
		int y[] = { 12, 34, 45, 67, 89, 440, 33, 45, 45 };
		int search = 44;
		boolean isFound = false;
		for(int i:y) 
		{
			if(i==search)
			{
				isFound = true;
				break;
			} 
		}
		
		if(isFound) {
			System.out.println("FOund");
		}else {
			System.out.println("Not found");
		}
	}
}
