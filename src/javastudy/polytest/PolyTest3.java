package javastudy.polytest;

public class PolyTest3 {
	public static void main(String[] args) {
		Fruit2 f = new Pear();
		Pear p = (Pear)f;
		p.run();
		p.grow();
	}
}

class Fruit2{
	public void run() {
		System.out.println("fruit is running");
	}
}

class Pear extends Fruit2{
	public void run() {
		System.out.println("pear is running");
	}
	public void grow() {
		System.out.println("pear is growing");
	}
}
