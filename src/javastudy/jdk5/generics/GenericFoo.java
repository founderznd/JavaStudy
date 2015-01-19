package javastudy.jdk5.generics;

public class GenericFoo<T> {

	private T foo;

	public T getFoo() {

		return foo;
	}

	public void setFoo(T foo) {

		this.foo = foo;
	}
	
	public static void main(String[] args) {

		GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
		GenericFoo<Integer> foo2 = new GenericFoo<Integer>();
		GenericFoo<String> foo3 = new GenericFoo<String>();
		
		foo1.setFoo(false);
		foo2.setFoo(32);
		foo3.setFoo("nandi");
		
		Boolean b = foo1.getFoo();
		Integer i = foo2.getFoo();
		String s = foo3.getFoo();
		
		System.out.println(b);
		System.out.println(i);
		System.out.println(s);
	}
}
