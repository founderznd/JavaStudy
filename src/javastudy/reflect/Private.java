package javastudy.reflect;

public class Private{

	private String sayHello(String name){
		return "hello :" + name;
	}
	
	public static void main(String[] args) {

		Private p = new Private();
		System.out.println(p.sayHello("chenjie"));
	}
}


