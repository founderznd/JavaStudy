/**
 * @author Nandi Zhou
 * 2015年5月5日
 * 使用序列化的方式来深克隆对象
 * 这种方法最简单，也不容易出错
 * 唯一需要注意的地方是，对于某些无法序列化的成员，需要添加transient将其屏蔽掉。
 */
package javastudy.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneTest2 {

	public static void main(String[] args) throws Exception {

		Teacher t = new Teacher();
		t.setAge(50);
		t.setName("Zhou");

		Student s1 = new Student();
		s1.setAge(20);
		s1.setName("zhansan");
		s1.setTeacher(t);

		Student s2 = (Student) s1.deepCopy();

		System.out.println("s2" + ": " + s2.getAge() + " " + s2.getName() + " " + s2.getTeacher().getAge() + " " + s2.getTeacher().getName());

		System.out.println("改变s2的teacher引用，观察s1的teacher是否也变化");
		s2.getTeacher().setAge(40);
		s2.getTeacher().setName("Liu");

		System.out.println("s1" + "：" + s1.getAge() + " " + s1.getName() + " " + s1.getTeacher().getAge() + " " + s1.getTeacher().getName());
		System.out.println("s2" + "：" + s2.getAge() + " " + s2.getName() + " " + s2.getTeacher().getAge() + " " + s2.getTeacher().getName());
	}
}

class Teacher implements Serializable {

	private int	age;
	private String name;

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
}

class Student implements Serializable {

	private int	 age;
	private String  name;
	private Teacher teacher;

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

	public Teacher getTeacher() {

		return teacher;
	}

	public void setTeacher(Teacher teacher) {

		this.teacher = teacher;
	}

	/**
	 * 序列化方式 深复制
	 * 
	 * @return 复制的对象
	 * @throws Exception
	 */
	public Object deepCopy() throws Exception {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		ObjectOutputStream oos = new ObjectOutputStream(baos);

		oos.writeObject(this);

		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));

		return ois.readObject();
	}
}
