package javastudy.designpatter.strategy;
/*
 * 策略模式编写步骤：
 * 1、定义一个公共接口。
 * 2、编写策略类，该类实现公共接口。
 * 3、在使用策略对象的类中保存一个对策略对象的引用
 * 4、在使用策略对象的类中，实现对策略对象的set和get，或者使用构造方法完成赋值。
 * 
 */

public class Enviroment {

	private Strategy strategy;
	
	public Enviroment(Strategy strategy){
		this.strategy = strategy;
	}

	public Strategy getStrategy() {

		return strategy;
	}

	public void setStrategy(Strategy strategy) {

		this.strategy = strategy;
	}
	
	public int calculate(int a ,int b) {
		
		return strategy.calculate(a,b);
	}
	
	public static void main(String[] args) {

		Enviroment en = new Enviroment(new AddStrategy());
		System.out.println(en.calculate(2,3));
		
		en.setStrategy(new SubtractStrategy());
		System.out.println(en.calculate(5,4));
		
		en.setStrategy(new MultiplyStrategy());
		System.out.println(en.calculate(5,4));
		
		en.setStrategy(new DivideStrategy());
		System.out.println((float)en.calculate(5,4));
	}
}
