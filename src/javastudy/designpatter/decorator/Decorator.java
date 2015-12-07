/**
 * @author Nandi Zhou
 * 2015Äê4ÔÂ23ÈÕ
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
