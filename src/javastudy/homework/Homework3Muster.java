package javastudy.homework;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 * 策略模式编写步骤：
 * 1、定义一个公共接口。
 * 2、编写策略类，该类实现公共接口。
 * 3、在使用策略对象的类中保存一个对策略对象的引用
 * 4、在使用策略对象的类中，实现对策略对象的set和get，或者使用构造方法完成赋值。
 * 
 */

public class Homework3Muster {

	public static void output(List<Person> list) {

		//更简单的iterator
		for (Person person : list) {
			System.out.println(person);
		}
	}

	public static void main(String[] args) {

		List<Person> list = new LinkedList<Person>();
		list.add(new Person(0, "chenjie", 32));
		list.add(new Person(1, "chenjie", 23));
		list.add(new Person(2, "zhangsan", 43));
		list.add(new Person(3, "chenjie", 19));
		list.add(new Person(4, "wangwu", 27));
		
		ListSort listsort = new ListSort(null);
		System.out.println("Sort by age:");
		listsort.setStrategy(new SortByAgeASC());
		listsort.sort(list);
		output(list);
		
		System.out.println("Sort by age reverse:");
		listsort.setStrategy(new SortByAgeDEC());
		listsort.sort(list);
		output(list);
		
		System.out.println("Sort by Id:");
		listsort.setStrategy(new SortByIdASC());
		listsort.sort(list);
		output(list);
		
		System.out.println("Sort by Id:");
		listsort.setStrategy(new SortByIdDEC());
		listsort.sort(list);
		output(list);
		
		System.out.println("Sort by name:");
		listsort.setStrategy(new SortByNameASC());
		listsort.sort(list);
		output(list);
		
		System.out.println("Sort by name reverse:");
		listsort.setStrategy(new SortByNameDEC());
		listsort.sort(list);
		output(list);

	}
}

//定义一个公共接口
interface SortStrategy {

	public void sort(List<Person> list);
}

//编写策略类
class SortByNameASC implements SortStrategy {

	public void sort(List<Person> list) {

		Collections.sort(list, new MyComparator());
	}

	class MyComparator implements Comparator<Person> {

		public int compare(Person o1, Person o2) {

			return o1.getName().compareTo(o2.getName());
		}
	}
}

class SortByNameDEC implements SortStrategy {

	public void sort(List<Person> list) {

		Collections.sort(list, new MyComparator());
	}

	class MyComparator implements Comparator<Person> {

		public int compare(Person o1, Person o2) {

			return o2.getName().compareTo(o1.getName());
		}
	}
}

class SortByIdASC implements SortStrategy {

	public void sort(List<Person> list) {

		Collections.sort(list, new MyComparator());
	}

	class MyComparator implements Comparator<Person> {

		public int compare(Person o1, Person o2) {

			return o1.getId() - o2.getId();
		}
	}
}

class SortByIdDEC implements SortStrategy {

	public void sort(List<Person> list) {

		Collections.sort(list, new MyComparator());
	}

	class MyComparator implements Comparator<Person> {

		public int compare(Person o1, Person o2) {

			return o2.getId() - o1.getId();
		}
	}
}

class SortByAgeASC implements SortStrategy {

	public void sort(List<Person> list) {

		Collections.sort(list, new MyComparator());
	}

	class MyComparator implements Comparator<Person> {

		public int compare(Person o1, Person o2) {

			return o1.getAge() - o2.getAge();
		}
	}
}

class SortByAgeDEC implements SortStrategy {

	public void sort(List<Person> list) {

		Collections.sort(list, new MyComparator());
	}

	class MyComparator implements Comparator<Person> {

		public int compare(Person o1, Person o2) {

			return o2.getAge() - o1.getAge();
		}
	}
}

//编写一个使用策略的类
class ListSort{
	
	//保存一个策略对象的引用
	private SortStrategy strategy;

	//实现对策略的set和get
	public SortStrategy getStrategy() {

		return strategy;
	}

	public void setStrategy(SortStrategy strategy) {

		this.strategy = strategy;
	}
	
	//方法重载,两种不同的赋值方式实现sort
	public void sort(List<Person> list) {

		this.strategy.sort(list);
	}
	
	public void sort(List<Person> list,SortStrategy strategy) {
		
		strategy.sort(list);
	}
	
	//构造方法赋初值
	public ListSort(SortStrategy strategy) {
		this.strategy = strategy;
	}
}








