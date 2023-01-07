package real;

public class FlyingBird extends Bird{
	void fly() {
		System.out.println("Every birds can fly");
	}
	
	public static void main(String[] args) {
		FlyingBird parrot = new FlyingBird();
		parrot.wings();
		parrot.legs();
		parrot.fly();
				
	}
}
