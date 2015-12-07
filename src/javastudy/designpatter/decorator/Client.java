/**
 * @author Nandi Zhou
 * 2015��4��23��
 * 
 */
package javastudy.designpatter.decorator;

public class Client {

	public static void main(String[] args) {

		Component cd1 = new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()));
		cd1.doSomething();
		Component cd2 = new ConcreteDecorator1(new ConcreteDecorator2(new ConcreteComponent()));
		cd2.doSomething();
	}
}
