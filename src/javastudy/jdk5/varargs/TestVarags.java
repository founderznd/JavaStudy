package javastudy.jdk5.varargs;

public class TestVarags {

	/*
	 * 可变参数：本质上就是一个数组。
	 * 对于某个声明了可变参数的方法来说，我们即可以传递离散的值，也可以传递数组对象。
	 * 但如果将方法中的参数定义为数组，那么只能传递数组队形而不能传递离散的值。
	 * 可变参数必须要作为方法的最后一个参数，即一个方法不可能具有多个参数
	 */
	private static int sum(int... nums) {

		int sum = 0;

		for (int i : nums) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {

		int result = sum(1, 2, 3, 4, 5, 6);
		System.out.println(result);
	}
}
