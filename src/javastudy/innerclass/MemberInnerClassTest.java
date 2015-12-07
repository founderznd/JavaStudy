/**
 * 
 */
package javastudy.innerclass;

/**
 * 成员内部类
 * 
 * @author Nandi Zhou
 *
 */
public class MemberInnerClassTest {

	public static void main(String[] args) {

		MemberOuter.MemberInner inner = new MemberOuter().new MemberInner();
		inner.doSomething();
	}
}

class MemberOuter {

	private String a = "MemberInner";

	public class MemberInner {

		private String a = "Inner2";

		public void doSomething() {

			System.out.println(MemberOuter.this.a);
			System.out.println(this.a);
		}
	}

	public void method() {

		MemberInner inner = this.new MemberInner();
		inner.doSomething();
	}
}
