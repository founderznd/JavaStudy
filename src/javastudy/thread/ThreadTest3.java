/**
 * @author Nandi Zhou
 * 2015��4��25��
 * synchronized ��
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
		 * ���ڸ��ӷ�����˵��ʹ��synchronized���ܼ������ߴ�������Ч�� 
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
