package datetime;

import java.util.Arrays;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		System.out.println(Calendar.getInstance());
		String s1 ="abc,";
		s1 = s1.replaceFirst(s1.charAt(0)+"", (s1.charAt(0)+"").toUpperCase());
		System.out.println(getSortedString("Hello").equalsIgnoreCase(getSortedString("hello")));
		s1.chars().sorted().toArray();
	}
	static String getSortedString(String s)
	{
	     char [] arr =s.toCharArray();
	        for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length;j++){
	                String s1 = arr[i]+"";
	                String s2 = arr[j]+"";
	                if(s1.compareTo(s2)>0){
	                	char temp = arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
	        System.out.println(String.valueOf(arr));
	        return String.valueOf(arr);
	}
}
