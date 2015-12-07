/**
 * @author Nandi Zhou
 * 2015年4月25日
 * 
 * 线程的同步
 */
package javastudy.thread;

public class ThreadTest2 {

	public static void main(String[] args) {

		/*
		 * 注意共同使用一个instance 和 分别创建不同instance的区别 
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
	 * 注意成员变量和局部变量的区别
	 */
	//		int i;

	@Override
	public void run() {

		synchronized (this) {

			int i = 0;

			while (i <= 10) {

				System.out.println(Thread.currentThread().getName() + " i := " + i++);

				try {
					Thread.sleep((long) (Math.random() * 500));//线程的睡眠
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
