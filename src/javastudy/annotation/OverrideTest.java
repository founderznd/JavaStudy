package javastudy.annotation;

public class OverrideTest {
	/*
	 * @Override��ʾ ���� Ҫ��д����Ķ�Ӧ����
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		
		return "this is toString";
	}
	
	public static void main(String[] args) {
		
		OverrideTest test = new OverrideTest();
		
		System.out.println(test);
	}
}
