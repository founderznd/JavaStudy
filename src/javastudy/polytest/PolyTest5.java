package javastudy.polytest;

public class PolyTest5 {
	/*������ö�̬���ж����ֳ�����Ҫ���ٴη���������
	public void run(Benz benz) {
		benz.run();
	}
	public void run(Texi texi) {
		texi.run();
	}
	*/
	//ʹ�ö�̬�Ժ󣬾Ϳ��Խ���������ĳ�������һ������
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
		//��������ת��
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