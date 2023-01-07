public class C extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 2000; i++) {
			System.out.println(i + "-" + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		C c1 = new C();
		c1.setDaemon(true);
		c1.start();
		for (int i = 10; i < 2000; i++) {
			System.out.println(i + "-" + Thread.currentThread().getName());
		}
	}
}
