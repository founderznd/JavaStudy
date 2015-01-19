package javastudy.interfacetest;
public class InterfaceTest {
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.output();
		myclass.output2();
		myclass.output3();
	}
}

interface MyInterface {
	public void output();
}

interface MyInterface2 {
	public void output2();
}

class MyParent {
	public void output3() {
		System.out.println("output3");
	}
}

class MyClass extends MyParent implements MyInterface, MyInterface2 {
	public void output() {
		System.out.println("output");
	}

	public void output2() {
		System.out.println("output2");
	}
}
