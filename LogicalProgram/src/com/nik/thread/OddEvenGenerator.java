package com.nik.thread;

public class OddEvenGenerator {

	volatile int counter = 1;
	Object obj = new Object();

	class odd implements Runnable {
		@Override
		public void run() {
			printOdd();

		}

		void printOdd() {
			synchronized (obj) {
				while (counter<100) {
					if (counter % 2 != 0) {
						System.out.println(counter);
						counter++;
					} else {
						try {
							obj.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					obj.notify();
				}
			}
		}
	}

	class Even implements Runnable {
		@Override
		public void run() {
			printEven();

		}

		synchronized void printEven() {
			synchronized (obj) {
				while (counter<100) {
					if (counter % 2 == 0) {
						System.out.println(counter);
						counter++;
					} else {
						try {
							obj.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					obj.notify();
				}
			}
		}
	}

	public static void main(String[] args) {
		OddEvenGenerator obj = new OddEvenGenerator();
		new Thread(obj.new Even()).start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread(obj.new odd()).start();
		
	}
}
