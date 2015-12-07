/**
 * @author Nandi Zhou
 * 2015��4��25��
 * 
 * �̵߳�ͬ��
 */
package javastudy.thread;

public class ThreadTest2 {

	public static void main(String[] args) {

		/*
		 * ע�⹲ͬʹ��һ��instance �� �ֱ𴴽���ͬinstance������ 
		 */
		Runnable r = new HelloThread();
		Thread t0 = new Thread(r, "aa");
		Thread t1 = new Thread(r, "bb");
		Thread t2 = new Thread(new HelloThread(), "cc");

		t0.start();
		t1.start();
		t2.start();

	}
}

class HelloThread implements Runnable {

	/*
	 * ע���Ա�����;ֲ�����������
	 */
	//		int i;

	@Override
	public void run() {

		synchronized (this) {

			int i = 0;

			while (i <= 10) {

				System.out.println(Thread.currentThread().getName() + " i := " + i++);

				try {
					Thread.sleep((long) (Math.random() * 500));//�̵߳�˯��
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
