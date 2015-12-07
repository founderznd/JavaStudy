/**
 * @author Nandi Zhou
 * 2015��4��23��
 * 
 */
package javastudy.designpatter.decorator;

public class ConcreteDecorator2 extends Decorator {

	/**
	 * 
	 */
	public ConcreteDecorator2(Component c) {

		super(c);
	}

	@Override
	public void doSomething() {

		this.doAnotherthing();
		super.doSomething();
	}

	private void doAnotherthing() {

		System.out.println("����C");
	}
}
