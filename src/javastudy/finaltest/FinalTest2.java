package javastudy.finaltest;

public class FinalTest2 {
	public static void main(String[] args) {
		People people = new People();
		System.out.println(people.address.name);
		people.address.name = "Chemnitz";
		System.out.println(people.address.name);
	}
}

class People{
	final Address address = new Address();
}

class Address{
	String name = "ChongQing";
}