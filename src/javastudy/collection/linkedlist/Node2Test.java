package javastudy.collection.linkedlist;


public class Node2Test {

	public static void output(Node2 n) {

		Node2 tmp = n;
		while (tmp.next != n) {
			System.out.print(tmp.data + " -> ");
			tmp = tmp.next;
		}
		System.out.println(tmp.data);
	}
	
	public static void insertNode(Node2 n,Node2 p) {

		n.next = p.next;
		p.next.pre = n;
		
		n.pre = p;
		p.next = n;
		
	}
	
	public static void removeNode(Node2 n,Node2 p) {

		p.next = n.next;
		n.next.pre = p;
		n.pre = null;
		n.next = null;
	}
	
	public static void main(String[] args) {

		Node2 n1 = new Node2("node1");
		Node2 n2 = new Node2("node2");
		Node2 n3 = new Node2("node3");
		
		n1.next = n2;n2.pre = n1;
		n2.next = n3;n3.pre = n2;
		n3.next = n1;n1.pre = n3;
		output(n1);
		output(n2);
		
		System.out.println("------------------------------");
		Node2 n4 =new Node2("node4");
		insertNode(n4,n1);
		output(n1);
		
		System.out.println("------------------------------");
		removeNode(n4,n1);
		output(n1);
		
	}
}
