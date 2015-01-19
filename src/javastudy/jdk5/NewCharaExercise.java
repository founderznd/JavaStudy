package javastudy.jdk5;

import java.util.HashMap;
import java.util.Set;

public class NewCharaExercise {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		/*
		 * 3�д��룬�õ���  �Զ�װ�䣬���䣬�����µ�forѭ��
		 */
		for (String word : args) {
			map.put(word, (null == map.get(word) ? 1 : map.get(word) + 1));
		}

		System.out.println(map);

		Set<String> set = map.keySet();
		for (String string : set) {
			Integer in = map.get(string);
			System.out.println(string + " = " + in);
		}
	}
}
