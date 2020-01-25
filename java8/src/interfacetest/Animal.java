package interfacetest;

import java.util.ArrayList;
import java.util.List;

public class Animal implements Walkable
{
	public static void main(String[] args)
	{
		Animal tiger = new Animal();
		tiger.move();
	}
	
}

class Animal1 implements Moveable
{
	@Override
	public void move()
	{
		System.out.println("I am running");
	}

	public void useFOreach()
	{
		List<Animal> list = new ArrayList<Animal>();
		list.add(new Animal());
		list.add(new Animal());
		list.add(new Animal());

		// Iterator code reduced to one line
		list.forEach((Moveable p) -> p.move());
	}

	public static void main(String[] args)
	{
		Animal1 tiger = new Animal1();
		tiger.move();
		tiger.useFOreach();
	}
}