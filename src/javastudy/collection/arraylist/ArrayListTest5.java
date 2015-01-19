package javastudy.collection.arraylist;

import java.util.ArrayList;

public class ArrayListTest5 {

	public static void main(String[] args) {

		ArrayList<Point> list = new ArrayList<Point>();
		list.add(new Point(2, 3));
		list.add(new Point(3, 4));
		list.add(new Point(4, 4));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
class Point {

	int x, y;

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x= " + this.x + " y= " + this.y;
	}
}
