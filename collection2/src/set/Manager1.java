package set;
import java.util.HashSet;
class D
{
	int i;
	D(int i)
	{
		this.i=i;
	}
	@Override
	public String toString()
	{
		return ""+i;
	}
}

public class Manager1
{
public static void main(String[] args)
{
	HashSet set=new HashSet();
	set.add("abc");
	set.add("abc");
	System.out.println(set);
	HashSet set1=new HashSet();
	set1.add(90);//Integer
	set1.add(90);
	System.out.println(set1);
	HashSet set2=new HashSet();
	set2.add(true);//Boolean
	set2.add(true);
	System.out.println(set2);
	HashSet set3=new HashSet();
	set3.add(new StringBuffer("abc"));
	set3.add(new StringBuffer("abc"));
	System.out.println(set3);
	HashSet set4=new HashSet();
	set4.add(new D(34));
	set4.add(new D(34));
	System.out.println(set4);
	
}
}
