/**
 * @author Nandi Zhou
 * 2015年4月23日
 * 
 */
package javastudy.designpatter.decorator;

public class ConcreteComponent implements Component {

	@Override
	public void doSomething() {

		System.out.println("功能A");
	}

}
