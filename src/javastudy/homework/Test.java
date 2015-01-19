package javastudy.homework;

public class Test {

	public static void main(String[] args) {

		Queue q = new Queue();
		System.out.println(q.isEmpty());
		q.put("a");
		q.put("b");
		q.put("c");
		q.put("d");
		q.put("e");
		String s = (String)q.get();
		System.out.println(s);
		while (q.isEmpty() == false) {
			System.out.print(q.get() + " ");
		}
		System.out.println();
		System.out.println("--------------------------");

		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push("a");
		st.push("b");
		st.push("c");
		st.push("d");
		st.push("e");
		System.out.println(st.peek());
		while (st.isEmpty() == false) {
			System.out.print(st.pop() + " ");
		}
		System.out.println();

	}
}
