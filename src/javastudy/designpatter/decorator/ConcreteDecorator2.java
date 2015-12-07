/**
 * @author Nandi Zhou
 * 2015年4月23日
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

		System.out.println("功能C");
	}
}
