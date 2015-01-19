package javastudy.Object.String;

public class EqualsTest {
	
	public static void main(String[] args) {
		Student st1 = new Student("nandi");
		Student st2 = new Student("nandi");
		
		System.out.println(st1 == st2);
		
		System.out.println(st1.equals(st2));
		
	}
}

class Student{
	
	String name;
	
	public Student(String name){
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj instanceof Student) {
			Student student = (Student)obj;
			return(this.name == student.name);
		}
		return false;
	}
}
