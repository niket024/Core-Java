package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter1
{
	public static void main(String[] args)
	{
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		//till java 7
		System.out.println("---------java 7-----------");
		for(String name: memberNames){
			if(name.startsWith("A")){
				System.out.println(name);
			}
		}
		
		System.out.println("--------printing in uppercase-------------");
		System.out.println("---------java 7-----------");
		for(String name: memberNames){
			if(name.startsWith("A")){
				System.out.println(name.toUpperCase());
			}
		}
		//from java 8
		System.out.println("--------java 8---------");
		memberNames.stream().filter(name-> name.startsWith("A")).forEach(System.out::println);
		System.out.println("--------printing in uppercase-------------");

		memberNames.stream().filter(name-> name.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
	}
}
