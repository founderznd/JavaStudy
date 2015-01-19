package javastudy.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * ͳ��Java �Ĳ���������ִ���
 */
public class MapTest3 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < args.length; i++) {
			//�ؼ����ڽ�args[i]����key����Ϊkey�޷��ظ���
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
