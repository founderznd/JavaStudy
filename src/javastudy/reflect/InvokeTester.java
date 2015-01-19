package javastudy.reflect;

import java.lang.reflect.Method;

public class InvokeTester {

	//	public int add(int i1,int i2) {
	//
	//		return i1 + i2;
	//	}

	public int add(int... nums) {

		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		return sum;
	}

	public String echo(String message) {

		return "hello: " + message;
	}

	public static void main(String[] args) throws Exception {

		//InvokeTester test = new InvokeTester();
		//System.out.println(test.add(1,2,3));
		//System.out.println(test.echo("nandi"));

		/*
		 * ����
		 * 1����ȡclass����
		 * 2�����ɸö�������Ӧ���һ��ʵ��
		 * 3����ȡ�ö���ķ���
		 * 4��ͨ������ʵ���ķ����õ����
		 */
		//Class<?> typ = Class.forName("javastudy.reflect.InvokeTester");
		Class<?> typ = InvokeTester.class;

		Object obj = typ.newInstance();
		//System.out.println(obj instanceof InvokeTester);

		/*
		 * getMethod
		 * ��һ�������Ƿ��������ơ�
		 * �ڶ��������Ǹ÷����Ĳ�������Ӧ��class��������顣
		 * ��ʹ�ò�������Ͷ�Ӧ�������ͣ�Ҳ��Ϊ��һԪ�ش���� class ��������ĳ��λ�á�
		 * ���£�add�����Ĳ�����һ���ɱ��������һ��int[]��
		 * ���԰�int[].class�����Class[]�ĵ�һ��λ�á�
		 * û�������Ĳ�����
		 * ��Class[]����ֻ��һ��Ԫ�ء�
		 */
		Method addMethod = typ.getMethod("add", new Class[] {
			int[].class
		});

		/*
		 * ��׼д���ǣ�
		 * Object res = addMethod.invoke(obj,new Object[] {new int[] {1,2}});
		 * ��˼�ǣ�����{1,2}��Ϊһ���������Object[]�С�
		 * ����ò��ֱ���������ʹ���Ҳ��
		 */
		Object res = addMethod.invoke(obj, new int[] {
				1, 2, 3, 4, 5
		});

		System.out.println(res);

		System.out.println("-----------------------");

		Method echoMethod = typ.getMethod("echo", new Class[] {
			String.class
		});

		Object res2 = echoMethod.invoke(obj, new Object[] {
			"nandi"
		});

		System.out.println(res2);

		System.out.println("-----------------------");

	}
}
