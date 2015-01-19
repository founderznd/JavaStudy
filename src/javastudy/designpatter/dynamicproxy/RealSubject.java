package javastudy.designpatter.dynamicproxy;

public class RealSubject implements Subject {

	@Override
	public void request() {

		System.out.println("from real subject");
	}
	
	public void request(String msg){
		
		System.out.println("from real subject:" + msg);
	}
}
