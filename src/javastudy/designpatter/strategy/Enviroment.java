package javastudy.designpatter.strategy;
/*
 * ����ģʽ��д���裺
 * 1������һ�������ӿڡ�
 * 2����д�����࣬����ʵ�ֹ����ӿڡ�
 * 3����ʹ�ò��Զ�������б���һ���Բ��Զ��������
 * 4����ʹ�ò��Զ�������У�ʵ�ֶԲ��Զ����set��get������ʹ�ù��췽����ɸ�ֵ��
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
