/**
 * 
 */
package javastudy.innerclass;

/**
 * ¾²Ì¬ÄÚ²¿Àà
 * 
 * @author Nandi Zhou
 *
 */
public class StaticInnerClassTest {

	public static void main(String[] args) {

		StaticOuter.StaticInner inner = new StaticOuter.StaticInner();
		inner.test();
	}
}

class StaticOuter {

	private static int a = 4;

	public static class StaticInner {

		public void test() {

			System.out.println(a);
		}
	}
}