 package javastudy.homework;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * 假如有若干个类 Person 的对象存在一个 List 当中。 对他们分别按照名字、年龄、Id进行排序，要有正序和倒序两种排序方式。
 * 假如年龄或者姓名重复，按照 id 的正序进行排序。要求使用策略模式进行。
 */
public class Homework3 {

	public static void output(List<?> list) {

		for (Iterator<?> iterator = list.iterator(); iterator.hasNext();) {
			Person p = (Person)iterator.next();
			System.out.println(p);
		}

	}

	public static void main(String[] args) {

		List<Person> list = new LinkedList<Person>();
		list.add(new Person(0, "chenjie", 32));
		list.add(new Person(1, "chenjie", 23));
		list.add(new Person(2, "zhangsan", 43));
		list.add(new Person(3, "chenjie", 19));
		list.add(new Person(4, "wangwu", 27));

		System.out.println("Sorted by Age:");
		Collections.sort(list, new SortByAge<Person>());
		output(list);
		
		System.out.println("Sorted by Age Reverse:");
		Collections.sort(list, new SortByAgeReverse<Person>());
		output(list);

		System.out.println("Sorted by Id:");
		Collections.sort(list, new SortById<Person>());
		output(list);

		System.out.println("Sorted by Id Reverse:");
		Collections.sort(list, new SortByIdReverse<Person>());
		output(list);
		
		System.out.println("Sorted by Name:");
		Collections.sort(list, new SortByName<Person>());
		output(list);

		System.out.println("Sorted by Name Reverse:");
		Collections.sort(list, new SortByNameReverse<Person>());
		output(list);

	}
}

class SortByName<T> implements Comparator<T> {

	public int compare(T o1, T o2) {

		return ((Person)o1).getName().compareTo(((Person)o2).getName());
	}
}

class SortByNameReverse<T> implements Comparator<T> {

	public int compare(T o1, T o2) {

		return ((Person)o2).getName().compareTo(((Person)o1).getName());
	}
}

class SortById<T> implements Comparator<T> {

	public int compare(T o1, T o2) {

		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		return p1.getId() - p2.getId();
	}
}

class SortByIdReverse<T> implements Comparator<T> {
	
	public int compare(T o1, T o2) {
		
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		return p2.getId() - p1.getId();
	}
}

class SortByAge<T> implements Comparator<T> {

	public int compare(T o1, T o2) {

		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		return p1.getAge() - p2.getAge();
	}
}

class SortByAgeReverse<T> implements Comparator<T> {
	
	public int compare(T o1, T o2) {
		
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		return p2.getAge() - p1.getAge();
	}
}

class Person {

	private int id, age;
	private String name;

	public Person(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String toString() {

		return (this.id + " :" + this.age + " " + this.name);
	}
}
