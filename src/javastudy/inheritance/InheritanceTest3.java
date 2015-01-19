package javastudy.inheritance;
public class InheritanceTest3 {
	public static void main(String[] args) {
		Son son = new Son();
		son.output();
	}
}

class Grandpa {
	public Grandpa() {
		System.out.println("Grandpa");
	}
}

class Father extends Grandpa {
	public Father() {
		System.out.println("Father");
	}
}

class Son extends Father {
	public Son() {
		System.out.println("Son");
	}
	
	public void output(){
		System.out.println("this is the son");
	}
}
