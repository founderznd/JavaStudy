package javastudy.collection.set;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {

		HashSet<People> set = new HashSet<People>();
		HashSet<String> set2 = new HashSet<String>();
		
		//��������������ͬ�ĵ�ַ���������������� hashCode��
		set.add(new People("nandi"));
		set.add(new People("jiejie"));
		set.add(new People("jiejie"));
		System.out.println(set);
		set.clear();
		
		//ͬһ�����ã�ָ��ͬһ��ַ��hashCodeһ�������ж�p1.equals(p1)��
		People p1 = new People("nandi");		
		set.add(p1);
		set.add(p1);
		System.out.println(set);
		set.clear();
		
		//String �൱�У�equals ������ hashCode ����������д��
		//��ʱequals �жϵ��� String �������Ƿ�һ�£����Բ���add�ڶ���
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
