package javastudy.jdk5.staticimport;
/*
 * ��̬���������嵽������ࡣ
 */
import static javastudy.jdk5.common.Common.AGE;
import static javastudy.jdk5.common.Common.output;

public class StaticImportTest {

	public static void main(String[] args) {
		/*
		 * �����Ժ� ����ֱ��ʹ�ã���������
		 */
		int a = AGE;
		
		System.out.println(a);
		
		output();		
	}
}
