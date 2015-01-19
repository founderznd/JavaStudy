package javastudy.statictest;
public class StaticTest3 {
	public static void main(String[] args) {
		M.output();
		N.output();
	}
}

class M{
	public static void output(){
		System.out.println("M");
	}
}

class N extends M{
	public static void output(){
		System.out.println("N");
	}
}