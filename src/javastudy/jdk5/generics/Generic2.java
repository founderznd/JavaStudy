package javastudy.jdk5.generics;

public class Generic2<T> {

	private T[] fooArrary;

	public T[] getFooArrary() {

		return fooArrary;
	}

	public void setFooArrary(T[] fooArrary) {

		this.fooArrary = fooArrary;
	}

	public static void main(String[] args) {

		Generic2<String> foo = new Generic2<String>();

		String[] str1 = {"hello","world","welcome"};
		String[] str2 = null;
		
		foo.setFooArrary(str1);
		
		str2 = foo.getFooArrary();
		
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i] + " ");
		}
		System.out.println();
		
	}
}
