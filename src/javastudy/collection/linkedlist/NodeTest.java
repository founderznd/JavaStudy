package javastudy.collection.linkedlist;

public class NodeTest {

	public static void output(Node node) {

		Node tmp = node;
		while (tmp.next != null) {
			System.out.print(tmp.data + " -> ");
			tmp = tmp.next;
		}
		System.out.println(tmp.data);
	}
	
	public static void insertNode(Node node,Node pre) {
		node.next = pre.next;
		pre.next = node;
	}

	public static void main(String[] args) {

		Node node1 = new Node("node1");
		Node node2 = new Node("node2");
		Node node3 = new Node("node3");

		node1.next = node2;
		node2.next = node3;

		output(node1);
		System.out.println("--------------------------");
		
		//insert a new node
		Node node4 = new Node("node4");
		insertNode(node4,node1);
		output(node1);
		System.out.println("--------------------------");
		
		//remove a node
		node1.next = node2;
		node4.next = null;
		output(node1);

	}
}
