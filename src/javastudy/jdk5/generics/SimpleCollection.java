package javastudy.jdk5.generics;

public class SimpleCollection<T> {

	private Object[] objArray;
	
	private int index = 0;
	
	public SimpleCollection() {

		objArray = new Object[10];
	}
	
	public SimpleCollection(int capacity) {

		objArray = new Object[capacity];
	}
	
	public void add(T t) {

		objArray[index++] = t;
	}
	
	public int getLength() {

		return this.index;
	}
	
	public Object get(int i) {
		return objArray[i];
	}
	
	public static void main(String[] args) {

		SimpleCollection<Integer> c = new SimpleCollection<Integer>();
		
		for (int i = 0; i < 10; i++) {
			c.add(new Integer(i));
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(c.get(i));
		}
	}
}
