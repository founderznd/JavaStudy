package javastudy.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class MapTest2 {

	public static void main(String[] args) {

		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("a","aa");
		map.put("b","bb");
		map.put("c","cc");
		map.put("d","dd");
		map.put("e","ee");
		
		Set<String> set = map.keySet();
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String key = iterator.next();
			String value = map.get(key);
			System.out.println(key + " = " + value);
		}
	}
}
