package polyMorphism.realtime;

public class TwoWheeler implements Vehicle {

	@Override
	public int getCost() {
		System.out.println("I am a two wheeler cost method");
		return 200000;
	}

	@Override
	public int getSpeed() {
		System.out.println("I am two wheeler speed method");
		return 200;
	}

}
