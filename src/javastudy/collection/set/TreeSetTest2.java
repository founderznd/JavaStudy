package javastudy.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {

		TreeSet<Person> set = new TreeSet<Person>(new PersonComparator<Person>());

		Person p1 = new Person(10);
		Person p2 = new Person(20);
		Person p3 = new Person(30);
		Person p4 = new Person(40);

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		for (Iterator<Person> iterator = set.iterator(); iterator.hasNext();) {
//			Person p = (Person)iterator.next();
//			System.out.print(p.score + " ");
			System.out.println(iterator.next());
		}
		System.out.println();
	}
}

class Person {

	int score;

	public Person(int score) {

		this.score = score;
	}
	
	public String toString() {	
		return String.valueOf(this.score);
	}
}

class PersonComparator<T> implements Comparator<T> {

	public int compare(T o1, T o2) {

		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		return p2.score - p1.score;
	}
}
