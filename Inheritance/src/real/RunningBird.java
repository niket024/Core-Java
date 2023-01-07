package real;

public class RunningBird extends Bird{
	void run() {
		System.out.println("Every bird can run");
	}
	
	public static void main(String[] args) {
		RunningBird ostrich = new RunningBird();
		ostrich.wings();
		ostrich.legs();
		ostrich.run();
				
	}
}
