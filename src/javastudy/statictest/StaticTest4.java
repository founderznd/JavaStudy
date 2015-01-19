package javastudy.statictest;
class P {
	static {
		System.out.println("P static block");
	}

	public P() {
		System.out.println("P constructor");
	}
}

class Q extends P{
	static{
		System.out.println("Q static block");
	}
	public Q(){
		System.out.println("Q constructor");
	}
}

class R extends Q{
	static{
		System.out.println("R static block");
	}
	public R(){
		System.out.println("R constructor");
	}
}

public class StaticTest4 {
	public static void main(String[] args) {
		new R();
		new R();
	}
}
