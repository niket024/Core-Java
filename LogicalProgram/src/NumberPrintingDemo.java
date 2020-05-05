class Thread1 implements Runnable {
	int counter;

	public Thread1(int counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		synchronized (this) {

			if (counter % 2 != 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println(counter);
				counter++;
				notify();
			}
		}
	}
}

class Thread2 implements Runnable {
	int counter;

	public Thread2(int counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		synchronized (this) {
			if (counter % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println(counter);
				counter++;
				notify();
			}
		}
	}
}

public class NumberPrintingDemo {
	public static void main(String[] args) {
		int counter = 1;
		Thread1 t1 = new Thread1(counter);
		Thread2 t2 = new Thread2(counter);
		Thread thread1 = new Thread(t1);
		thread1.start();
		Thread thread2 = new Thread(t2);
		thread2.start();
	}
}
