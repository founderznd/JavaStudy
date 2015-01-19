package javastudy.collection.set;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {

		HashSet<People> set = new HashSet<People>();
		HashSet<String> set2 = new HashSet<String>();
		
		//三个对象，三个不同的地址，所以他们有三个 hashCode。
		set.add(new People("nandi"));
		set.add(new People("jiejie"));
		set.add(new People("jiejie"));
		System.out.println(set);
		set.clear();
		
		//同一个引用，指向同一地址，hashCode一样，在判断p1.equals(p1)。
		People p1 = new People("nandi");		
		set.add(p1);
		set.add(p1);
		System.out.println(set);
		set.clear();
		
		//String 类当中，equals 方法和 hashCode 方法都被重写。
		//这时equals 判断的是 String 的内容是否一致，所以不会add第二个
		String s1 = new String("a");
		String s2 = new String("a");
		set2.add(new String("dsfds"));
		set2.add(s2);
		set2.add(s1);
		
		System.out.println(set2); 
	}
}

class People {

	String name;

	public People(String name) {

		this.name = name;
	}
}
