package comparable;

import java.util.Arrays;
class Hello
{
	
}
public class MyArrayDemo {
	public static void main(String[] args) {
		int myArray [] = new int[5];
		//0, 1,2,3,4
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i+1;
		}	
		
		for (int i = 0; i < 3; i++) {
			System.out.println(myArray[i]);
		}
		System.out.println("For each loop");
		
		for(int i:myArray) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(myArray));
		Hello arr [] = new Hello [10];
		arr[0] = new Hello();
	}
	
}