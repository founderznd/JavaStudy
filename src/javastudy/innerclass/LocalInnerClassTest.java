/**
 * 
 */
package javastudy.innerclass;

/**
 * @author Nandi Zhou
 *
 */
public class LocalInnerClassTest {

	public static void main(String[] args) {

		LocalOuter inner = new LocalOuter();
		inner.method();
	}
}

class LocalOuter {

	public void method() {

		int a = 4;

		class LocalInner {

			public void test() {

				System.out.println(a);
			}
		}
		new LocalInner().test();
	}
}