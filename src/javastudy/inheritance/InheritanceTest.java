package javastudy.inheritance;
public class InheritanceTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.run();
		dog.run(1);
	}
}

class Animal {
	public void run() {
		System.out.println("this is the Animal");
	}
}

class Dog extends Animal {
	public void run() {// Override
		super.run();
		System.out.println("this is the Dog");
		super.run();// In this case, the super can be used after codes
	}

	public void run(int i) {// Overload
		System.out.println("this is the Dog");
	}
}
