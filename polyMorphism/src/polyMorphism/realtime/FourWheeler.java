package polyMorphism.realtime;

public class FourWheeler implements Vehicle{

	@Override
	public int getCost() {
		System.out.println("I am a four wheeler cost method");
		return 2000000;
	}

	@Override
	public int getSpeed() {
		System.out.println("I am four wheeler speed method");
		return 300;
	}
	
}
