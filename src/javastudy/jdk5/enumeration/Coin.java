package javastudy.jdk5.enumeration;

public enum Coin {
	/*
	 * ÿ��ö�ٵĳ�Աʵ���Ͼ����������ö�����͵�ʵ����
	 */
	penny("germany"), nickel("hello"), dime("welcome"), quarter("hello world");

	private String value;

	public String getValue() {

		return value;
	}

	/*
	 * ö�ٵĹ��췽��
	 */
	Coin(String value) {

		this.value = value;
	}
	
	public static void main(String[] args) {

		Coin coin = Coin.quarter;
		System.out.println(coin.getValue());
	}
}
