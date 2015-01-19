package javastudy.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * 统计Java 的参数及其出现次数
 */
public class MapTest3 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < args.length; i++) {
			//关键在于将args[i]当作key，因为key无法重复。
			if (map.get(args[i]) == null) {
				map.put(args[i], new Integer(1));
			}
			else {
				Integer in = (Integer)map.get(args[i]);
				map.put(args[i], new Integer(in.intValue() + 1));
			}
		}
		System.out.println(map);
		Set<String> set = map.keySet();
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String key = (String)iterator.next();
			Integer value = (Integer)map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
