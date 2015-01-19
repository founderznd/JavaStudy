package javastudy.designpatter.proxy;

public class ProxySubject extends Subject {

	//代理角色内部引用了真实角色
	private RealSubject realSubject;
	@Override
	public void request() {
		//在真实角色操作之前所附加的操作
		this.preRequest();
		
		if (null == realSubject) {
			realSubject = new RealSubject();
		}
		//真实角色所完成的事情
		realSubject.request();
		
		//在真实角色操作之后所附加的操作
		this.postRequest();
	}
	
	private void preRequest() {
		System.out.println("pre request");
	}
	
	private void postRequest() {
		System.out.println("post request");
	}

}
