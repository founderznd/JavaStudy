package javastudy.annotation;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class SuppressWarningsTest {

	/*
	 * @SuppressWarnings ��ʾ ���ƾ���
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public static void main(String[] args) {

		Map map = new TreeMap();

		map.put("hello", new Date());

		System.out.println(map.get("hello"));

		System.out.println(new Date().toLocaleString());
	}
}
