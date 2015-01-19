package javastudy.designpatter.proxy;

public class ProxySubject extends Subject {

	//�����ɫ�ڲ���������ʵ��ɫ
	private RealSubject realSubject;
	@Override
	public void request() {
		//����ʵ��ɫ����֮ǰ�����ӵĲ���
		this.preRequest();
		
		if (null == realSubject) {
			realSubject = new RealSubject();
		}
		//��ʵ��ɫ����ɵ�����
		realSubject.request();
		
		//����ʵ��ɫ����֮�������ӵĲ���
		this.postRequest();
	}
	
	private void preRequest() {
		System.out.println("pre request");
	}
	
	private void postRequest() {
		System.out.println("post request");
	}

}
