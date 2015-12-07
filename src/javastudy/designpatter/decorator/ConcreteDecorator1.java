/**
 * @author Nandi Zhou
 * 2015��4��23��
 * 
 */
package javastudy.designpatter.decorator;

public class ConcreteDecorator1 extends Decorator {

	/**
	 * 
	 */
	public ConcreteDecorator1(Component c) {

		super(c);
	}

	@Override
	public void doSomething() {

		this.doAnotherthing();
		super.doSomething();
	}

	private void doAnotherthing() {

		System.out.println("����B");
	}
}
