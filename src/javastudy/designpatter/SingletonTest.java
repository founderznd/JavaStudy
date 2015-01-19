package javastudy.designpatter;

/*
 * 单例模式 Singleton: 一个类只会生成唯一的一个对象。
 */
public class SingletonTest {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton == singleton2);
	}
}

/*
 * 在Singleton里面声明一个private static 对象
 * 定义一个getInstance方法，取出该对象。
 * 这样的结果：无论生成多少该类的对象，他的对象都指向该类的的private静态对象。
 */
class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {

		return singleton;
	}
}
