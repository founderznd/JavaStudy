package javastudy.designpatter.proxy;

//ÕæÊµ½ÇÉ«
public class RealSubject extends Subject {

	public void request() {
		System.out.println("real request");
	}
}
