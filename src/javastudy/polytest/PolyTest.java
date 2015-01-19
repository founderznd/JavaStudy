package javastudy.polytest;
public class PolyTest {
	public static void main(String[] args) {
		Rose rose = new Rose();
		rose.sing();
		Flower rose2 = new Rose();
		rose2.sing(); // this is the polymorphsim
	}
}

class Flower {
	public void sing() {
		System.out.println("flower is singing");
	}
}

class Rose extends Flower {

}
