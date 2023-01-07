package polyMorphism.realtime;

public class ThreeWheeler implements Vehicle{
	
	@Override
	public int getCost() {
		System.out.println("I am a three wheeler cost method");
		return 1000000;
	}

	@Override
	public int getSpeed() {
		System.out.println("I am three wheeler speed method");
		return 100;
	}

}
