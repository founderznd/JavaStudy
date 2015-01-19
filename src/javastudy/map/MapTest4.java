package javastudy.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {

		HashMap<String,String> map = new HashMap<String,String>();

		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");

		//map.entrySet()返回一个Map.Entry<K,V>的类
		Set<Map.Entry<String, String>> set = map.entrySet();

		for (Iterator<Map.Entry<String, String>> iter = set.iterator(); iter.hasNext();) {
			Map.Entry<String, String> entry = iter.next();

			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + " : " + value);
		
			
		}
	}
}
