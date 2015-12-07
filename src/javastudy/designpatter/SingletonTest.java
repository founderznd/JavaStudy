package javastudy.designpatter;

public class SingletonTest {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton == singleton2);

		//多线程问题
		new Thread(new MyThread()).start();
		new Thread(new MyThread()).start();
	}
}

/*
 * 单例模式
 */
class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	/*
	 * 网上总说 单例模式 的多线程问题。。。。。
	 * 暂时没有遇到
	 * 但不管怎么样，给getInstance()加上线程锁，可以避免这样的问题。
	 */
	public static synchronized Singleton getInstance() {

		if (null == singleton) {
			singleton = new Singleton();
		}
		return singleton;
	}
}

class MyThread implements Runnable {

	@Override
	public void run() {

		System.out.println(Singleton.getInstance());
	}
}
