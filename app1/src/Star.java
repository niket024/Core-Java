import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Star
{
	public static void main(String[] args)
	{
		int i, j, k = 8;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < k; j++)
			{
				System.out.print(" ");
			}
			k = k - 2;
			for (j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println(birthdayCakeCandles());;
		System.out.println(timeConversion("12:45:54PM"));;

	}

	static int birthdayCakeCandles()
	{
		int[] ar ={1,3,4,4,5,5,4,5};
		 List<Integer> list = new ArrayList<Integer>();
	        for (int i : ar)
	        {
	            list.add(i);
	        }
	        return Collections.frequency(list, Collections.max(list));

	}
	static String timeConversion(String s) {
        String arr[] = s.split(":");
        if(s.contains("PM")){
            int t = Integer.parseInt(arr[0]);
            int t1 = 12 + t;
            arr[0] = Integer.toString(t1);
            return String.join(":", arr).replace("PM", "");
        } else if(s.contains("AM")){
            if(arr[0].contains("12")){
                arr[0] = "00";
            }
            return String.join(":", arr).replace("AM", "");
            
        }else{
        	return s;
        }

	}
    

}