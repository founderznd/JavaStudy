/**
 * @author Nandi Zhou
 * 2015年4月25日
 * synchronized 块
 */
package javastudy.thread;

public class ThreadTest3 {

	public static void main(String[] args) {

		Runnable r = new Example();

		Thread t0 = new Thread(r, "aa");
		Thread t1 = new Thread(r, "bb");

		t0.start();
		t1.start();
	}
}

class Example implements Runnable {

	public Example() {

	}

	@Override
	public void run() {

		/*
		 * 对于复杂方法来说，使用synchronized块能极大的提高代码运行效率 
		 */
		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}

		for (int i = 10; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
