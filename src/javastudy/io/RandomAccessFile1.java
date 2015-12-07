/**
 * @author Nandi Zhou
 * 2015��4��23��
 * RandomAccessFile  随机文件读取
 * 使用这个类，可以跳转到文件的任意位置读写数据。程序可以在随机文件中插入数据，而不会破坏该文件的其他数据。此外，程序也可以更新或删除先前存储的数据，而不用重写整个文件。
 */
package javastudy.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile1 {

	public static void main(String[] args) throws Exception {

		Person p1 = new Person(1, "hello", 1.57);

		p1.write(new RandomAccessFile(new File("test.txt"), "rw"));

		Person p2 = new Person();

		p2.read(new RandomAccessFile("test.txt", "rw"));

		System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getHeight());
	}
}

class Person {

	private int	id;
	private String name;
	private double height;

	public int getId() {

		return id;
	}

	public String getName() {

		return name;
	}

	public double getHeight() {

		return height;
	}

	public void setId(int id) {

		this.id = id;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setHeight(double height) {

		this.height = height;
	}

	public Person() {

	}

	public Person(int id, String name, double height) {

		this.id = id;
		this.name = name;
		this.height = height;
	}

	/**
	 * 读写顺序必须一致
	 */
	public void write(RandomAccessFile raf) throws IOException {

		raf.writeInt(this.id);
		raf.writeUTF(this.name);
		raf.writeDouble(height);

	}

	public void read(RandomAccessFile raf) throws IOException {

		this.id = raf.readInt();
		this.name = raf.readUTF();
		this.height = raf.readDouble();
	}
}