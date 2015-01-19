package javastudy.annotation;

public class OverrideTest {
	/*
	 * @Override表示 子类 要重写父类的对应方法
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
