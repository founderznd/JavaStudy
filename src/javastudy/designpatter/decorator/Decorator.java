/**
 * @author Nandi Zhou
 * 2015��4��23��
 * 
 */
package javastudy.designpatter.decorator;

public class Decorator implements Component {

	private Component component;

	/**
	 * 
	 */
	public Decorator(Component c) {

		this.component = c;
	}

	@Override
	public void doSomething() {

		this.component.doSomething();
	}

}
