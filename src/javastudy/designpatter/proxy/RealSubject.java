package javastudy.designpatter.proxy;

//��ʵ��ɫ
public class RealSubject extends Subject {

	public void request() {
		System.out.println("real request");
	}
}
