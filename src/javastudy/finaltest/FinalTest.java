package javastudy.finaltest;

public class FinalTest {
	public static void main(String[] args) {
		F f = new F();
		f.output();
		f.age = 23;
		System.out.println(f.age);
	}
}

/* final */class E { // final means this class cannot be inheritenced.
	/* final */int age = 10;// final means this value cannot be changed.

	public/* final */void output() {// final means this method cannot be
									// overriden.
		System.out.println("E");
	}
}

class F extends E {
	public void output() {
		System.out.println("F");
	}
}
