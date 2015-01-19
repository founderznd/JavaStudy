package javastudy.designpatter;

/*
 * ����ģʽ Singleton: һ����ֻ������Ψһ��һ������
 */
public class SingletonTest {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton == singleton2);
	}
}

/*
 * ��Singleton��������һ��private static ����
 * ����һ��getInstance������ȡ���ö���
 * �����Ľ�����������ɶ��ٸ���Ķ������Ķ���ָ�����ĵ�private��̬����
 */
class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {

		return singleton;
	}
}
