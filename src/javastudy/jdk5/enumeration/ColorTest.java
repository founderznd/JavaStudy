package javastudy.jdk5.enumeration;

public class ColorTest {

	public static void main(String[] args) {

		Color mycolor = Color.Whilte;
		
		System.out.println(mycolor);
		
		for (Color color : Color.values()) {
			System.out.println(color);
		}
	}
}
