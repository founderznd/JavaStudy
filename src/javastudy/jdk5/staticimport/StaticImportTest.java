package javastudy.jdk5.staticimport;
/*
 * 静态导入必须具体到具体的类。
 */
import static javastudy.jdk5.common.Common.AGE;
import static javastudy.jdk5.common.Common.output;

public class StaticImportTest {

	public static void main(String[] args) {
		/*
		 * 导入以后 可以直接使用，不用引用
		 */
		int a = AGE;
		
		System.out.println(a);
		
		output();		
	}
}
