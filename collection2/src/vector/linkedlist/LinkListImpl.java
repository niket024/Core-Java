package vector.linkedlist;

public class LinkListImpl
{
	public static void main(String[] args)
	{
		Link l1 = new Link(12);
		Link l2 = new Link(13);
		Link l3 = new Link(45);
		Link l4 = new Link(56);
		Link l5 = new Link(78);
		
		// linking
		l1.nextLink = l2;
		l2.nextLink = l3;
		l3.nextLink = l4;
		l4.nextLink = l5;
		l5.nextLink = null;
		while (l1 != null)
		{
			System.out.println(l1.data1);
			l1 = l1.nextLink;
		}

	}
}
