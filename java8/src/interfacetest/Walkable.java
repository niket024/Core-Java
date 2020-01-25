package interfacetest;

public interface Walkable extends Moveable
{
	default void move()
	{
		System.out.println("I am walking");
	}
}
