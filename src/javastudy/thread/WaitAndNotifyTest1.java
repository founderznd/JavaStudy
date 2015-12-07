/**
 * @author Nandi Zhou
 * 2015年4月25日
 * 线程的等待与唤醒:线程之间的通信
 */
package javastudy.thread;

public class WaitAndNotifyTest1 {

	public static void main(String[] args) {

		Sample sample = new Sample();

		Thread t1 = new Thread(new IncreaseThread(sample), "t1");
		Thread t2 = new Thread(new DecreaseThread(sample), "t2");

		Thread t3 = new Thread(new IncreaseThread(sample), "t3");
		Thread t4 = new Thread(new DecreaseThread(sample), "t4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class IncreaseThread extends Sample implements Runnable {

	private Sample sample;

	public IncreaseThread(Sample s) {

		sample = s;
	}

	@Override
	public synchronized void run() {

		for (int i = 0; i < 20; i++) {

			try {
				Thread.sleep(300);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			sample.increase();
		}
	}
}

class DecreaseThread extends Sample implements Runnable {

	private Sample sample;

	public DecreaseThread(Sample s) {

		sample = s;
	}

	@Override
	public synchronized void run() {

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(300);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			sample.decrease();
		}
	}
}

class Sample {

	private int number;

	public synchronized void increase() {

		while (0 != number) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		number++;
		System.out.println(Thread.currentThread().getName() + " " + number);
		notifyAll();

	}

	public synchronized void decrease() {

		while (1 != number) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		number--;
		System.out.println(Thread.currentThread().getName() + " " + number);
		notifyAll();
	}
}
