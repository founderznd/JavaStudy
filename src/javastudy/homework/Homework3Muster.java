package javastudy.homework;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 * ����ģʽ��д���裺
 * 1������һ�������ӿڡ�
 * 2����д�����࣬����ʵ�ֹ����ӿڡ�
 * 3����ʹ�ò��Զ�������б���һ���Բ��Զ��������
 * 4����ʹ�ò��Զ�������У�ʵ�ֶԲ��Զ����set��get������ʹ�ù��췽����ɸ�ֵ��
 * 
 */

public class Homework3Muster {

	public static void output(List<Person> list) {

		//���򵥵�iterator
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

//����һ�������ӿ�
interface SortStrategy {

	public void sort(List<Person> list);
}

//��д������
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

//��дһ��ʹ�ò��Ե���
class ListSort{
	
	//����һ�����Զ��������
	private SortStrategy strategy;

	//ʵ�ֶԲ��Ե�set��get
	public SortStrategy getStrategy() {

		return strategy;
	}

	public void setStrategy(SortStrategy strategy) {

		this.strategy = strategy;
	}
	
	//��������,���ֲ�ͬ�ĸ�ֵ��ʽʵ��sort
	public void sort(List<Person> list) {

		this.strategy.sort(list);
	}
	
	public void sort(List<Person> list,SortStrategy strategy) {
		
		strategy.sort(list);
	}
	
	//���췽������ֵ
	public ListSort(SortStrategy strategy) {
		this.strategy = strategy;
	}
}








