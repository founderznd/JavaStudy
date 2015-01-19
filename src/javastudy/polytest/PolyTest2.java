package javastudy.polytest;

public class PolyTest2 {
	public static void main(String[] args) {
		/*
		 * Animal2 a = new Dog2(); Dog2 dog = (Dog2)a;
		 * //class的强制转换，a实际指向的什么类型，就能转换为什么类型的应用。 a.sing(); dog.sing(); Animal2 c
		 * = new Cat(); c.sing(); Cat d = (Cat)c; d.sing();
		 */
		/*
		 * Animal2 animal = new Cat(); Animal2 animal2 = new Animal2(); animal2
		 * = animal; animal2.sing();
		 */

		// 向上类型转换
		Cat cat = new Cat();
		Animal2 animal = (Animal2) cat;
		animal.sing();

		// 向下类型转换
		Animal2 a = new Cat();
		Cat c = (Cat) a;
		c.sing();
	}
}

class Animal2 {
	public void sing() {
		System.out.println("animal is singing");
	}
}

class Dog2 extends Animal2 {
	public void sing() {
		System.out.println("dog is singing");
	}
}

class Cat extends Animal2 {
	public void sing() {
		System.out.println("cat is singing");
	}
}
