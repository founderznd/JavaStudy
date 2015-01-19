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
		 * 反射
		 * 1、获取class对象。
		 * 2、生成该对象所对应类的一个实例
		 * 3、获取该对象的方法
		 * 4、通过调用实例的方法得到结果
		 */
		//Class<?> typ = Class.forName("javastudy.reflect.InvokeTester");
		Class<?> typ = InvokeTester.class;

		Object obj = typ.newInstance();
		//System.out.println(obj instanceof InvokeTester);

		/*
		 * getMethod
		 * 第一个参数是方法的名称。
		 * 第二个参数是该方法的参数所对应的class对象的数组。
		 * 即使该参数本身就对应数组类型，也作为单一元素存放在 class 这个数组的某个位置。
		 * 如下，add方法的参数是一个可变参数，即一个int[]。
		 * 所以把int[].class存放在Class[]的第一个位置。
		 * 没有其他的参数。
		 * 则Class[]里面只有一个元素。
		 */
		Method addMethod = typ.getMethod("add", new Class[] {
			int[].class
		});

		/*
		 * 标准写法是：
		 * Object res = addMethod.invoke(obj,new Object[] {new int[] {1,2}});
		 * 意思是，数组{1,2}作为一个整体放入Object[]中。
		 * 但是貌似直接用子类型代替也行
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
