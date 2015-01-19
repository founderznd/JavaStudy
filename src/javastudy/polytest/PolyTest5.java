package javastudy.polytest;

public class PolyTest5 {
	/*如果不用多态，有多少种车就需要多少次方法的重载
	public void run(Benz benz) {
		benz.run();
	}
	public void run(Texi texi) {
		texi.run();
	}
	*/
	//使用多态以后，就可以将所有种类的车都归于一个大类
	public void run(Car car) {
		car.run();
	}
	
	public static void main(String[] args) {
		/*
		PolyTest5 test = new PolyTest5();
		
		Benz benz = new Benz();
		test.run(benz);
		Texi texi = new Texi();
		test.run(texi);
		*/
		PolyTest5 test = new PolyTest5();
		Car car = new Benz();
		test.run(car);
		//向上类型转换
		Texi texi = new Texi();
		test.run(texi);
	}
}

class Car{
	public void run() {
		System.out.println("car is running");
	}
}

class Benz extends Car{
	public void run() {
		System.out.println("benz is running");
	}
}

class Texi extends Car{
	public void run() {
		System.out.println("texi is running");
	}
}