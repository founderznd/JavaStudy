package javastudy.jdk5.enumeration;

public enum Coin {
	/*
	 * 每个枚举的成员实际上就是所定义的枚举类型的实例。
	 */
	penny("germany"), nickel("hello"), dime("welcome"), quarter("hello world");

	private String value;

	public String getValue() {

		return value;
	}

	/*
	 * 枚举的构造方法
	 */
	Coin(String value) {

		this.value = value;
	}
	
	public static void main(String[] args) {

		Coin coin = Coin.quarter;
		System.out.println(coin.getValue());
	}
}
