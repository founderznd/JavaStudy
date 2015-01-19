package javastudy.jdk5.enumeration;


public class ShowEnum {

	public static void main(String[] args) {

		enumCompareTo(OpConstant.valueOf(args[0]));
	}

	public static void enumCompareTo(OpConstant constant) {

		System.out.println(constant);

		for (OpConstant c : OpConstant.values()) {

			System.out.println(constant.compareTo(c));
		}
	}
}
