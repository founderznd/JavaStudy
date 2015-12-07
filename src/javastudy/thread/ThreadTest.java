/**
 * @author Nandi Zhou
 * 2015年4月25日
 * 线程的创建
 */
package javastudy.thread;

public class ThreadTest {

	public static void main(String[] args) {

		Thread1 t0 = new Thread1();
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(new Thread2());
		t0.start();
		t1.start();
		t2.start();
	}
}

/**
 * 第一种 线程构造方法
 */
class Thread1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}

/**
 * 第二种 线程构造方法
 */
class Thread2 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
