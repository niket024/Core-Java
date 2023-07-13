public class D extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 2000; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		D d1 = new D();
		d1.setDaemon(true);
		d1.start();

		try {
			d1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("done");
	}
}
