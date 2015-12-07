/**
 * @author Nandi Zhou
 * 深复制和浅复制
 */
package javastudy.clone;

public class CloneTest1 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Father father = new Father();// 原始 父亲
		Son s1 = new Son();// 原始 儿子

		father.setAge(50);
		father.setName("ZhangLaosan");
		s1.setAge(18);
		s1.setName("ZhangXiaosi");
		father.setSon(s1);
		s1.setFather(father);

		Father father2 = (Father) father.clone();// 浅复制 父亲

		System.out.println("原始 父亲: " + father.getName() + " " + father.getAge() + " " + father.getSon().getName() + " " + father.getSon().getAge());
		System.out.println("克隆 父亲: " + father2.getName() + " " + father2.getAge() + " " + father.getSon().getName() + " " + father.getSon().getAge());

		System.out.println("更改原始父亲对应儿子的属性，看看克隆父亲的儿子是否变化");
		s1.setName("ZhangSi");

		System.out.println("原始 父亲: " + father.getName() + " " + father.getAge() + " " + father.getSon().getName() + " " + father.getSon().getAge());
		System.out.println("克隆 父亲: " + father2.getName() + " " + father2.getAge() + " " + father.getSon().getName() + " " + father.getSon().getAge());

		System.out.println("结论：浅复制下，克隆对象不会完整克隆自己的引用对象，所以原始父亲和克隆父亲的儿子都是同一个对象，当改对象发生改变，两个父亲的引用都会发生改变");
		System.out.println("---------------------");

		Son s2 = (Son) s1.clone();// 深复制

		System.out.println("原始儿子: " + s1.getName() + " " + s1.getAge() + " " + s1.getFather().getName() + " " + s1.getFather().getAge());
		System.out.println("克隆儿子: " + s2.getName() + " " + s2.getAge() + " " + s2.getFather().getName() + " " + s2.getFather().getAge());

		System.out.println("更改原始儿子对应父亲的属性，看看克隆儿子的父亲是否变化");
		father.setName("ZhangSan");

		System.out.println("原始儿子: " + s1.getName() + " " + s1.getAge() + " " + s1.getFather().getName() + " " + s1.getFather().getAge());
		System.out.println("克隆儿子: " + s2.getName() + " " + s2.getAge() + " " + s2.getFather().getName() + " " + s2.getFather().getAge());
		System.out.println("结论：深复制下，克隆对象会完整克隆自己的引用对象，所以原始儿子和克隆儿子的父亲是不同的对象，当某一个对象发生改变，另一个不会改变");

	}
}

class Father implements Cloneable {

	private int		age;
	private String	name;
	private Son		son;

	public Son getSon() {

		return son;
	}

	public void setSon(Son son) {

		this.son = son;
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

	/**
	 * 浅复制
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}

class Son implements Cloneable {

	private int		age;
	private String	name;
	private Father	father;

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

	public Father getFather() {

		return father;
	}

	public void setFather(Father father) {

		this.father = father;
	}

	/**
	 * 深复制
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Son son = (Son) super.clone();
		son.setFather((Father) son.getFather().clone());
		return son;
	}
}
