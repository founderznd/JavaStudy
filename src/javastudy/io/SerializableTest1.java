/**
 * @author Nandi Zhou
 * 2015年4月25日
 * 序列化和反序列化
 */
package javastudy.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest1 {

	public static void main(String[] args) throws Exception {

		Son s1 = new Son(20, "aaa", 1.67);
		Son s2 = new Son(18, "bbb", 1.84);
		Son2 s3 = new Son2(28, "ccc", 1.60);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));

		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);

		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));

		Son s = (Son) ois.readObject();
		System.out.println(s.age + " " + s.name + " " + s.height);
		Son ss = (Son) ois.readObject();
		System.out.println(ss.age + " " + ss.name + " " + ss.height);

		Son2 sss = (Son2) ois.readObject();
		System.out.println(sss.getId() + " " + sss.getName() + " " + sss.getHeight());

		ois.close();
	}
}

class Son implements Serializable {

	int			  age;
	transient String name;
	double		   height;

	public Son(int age, String name, double height) {

		this.age = age;
		this.name = name;
		this.height = height;
	}
}

/**
 * 为什么本地内部类能够正确读取到数据，继承其他包的类就不行呢？？？？？？<br>
 * 虽然不知道具体什么原因，但是问题应该出在继承其他包的类时，必须要实现: <br>
 * private void writeObject(java.io.ObjectOutputStream out) throws<br>
 * IOException private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException<br>
 * 这两个函数
 */
class Son2 extends Person implements Serializable {

	public Son2(int age, String name, double height) {

		super(age, name, height);
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {

		out.writeInt(getId());
		out.writeUTF(getName());
		out.writeDouble(getHeight());
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {

		setId(in.readInt());
		setName(in.readUTF());
		setHeight(in.readDouble());
	}
}
