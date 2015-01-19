package javastudy.jdk5.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapTest {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String,String>();
		
		map.put("a","aa");
		map.put("b","bb");
		map.put("c","cc");
		map.put("d","dd");

		Set<String> set = map.keySet();
		
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String key = iterator.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("----------------------------------");
		
		Set<Map.Entry<String,String>> set2 = map.entrySet();
		
		for (Iterator<Map.Entry<String,String>> iterator = set2.iterator(); iterator.hasNext();) {
			Map.Entry<String,String> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
