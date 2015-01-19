package javastudy.map;

import java.util.HashMap;

public class MapTest1 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("a", "nandi");
		map.put("b", "chenjie");
		map.put("c", "jiejie");
		map.put("a", "yaozhong");

		System.out.println(map);
		System.out.println(map.get("a"));
		System.out.println(map.get("e"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		HashMap<String, st> map2 = new HashMap<String, st>();
		map2.put("a", new st());
		map2.put("b", new st());
		map2.put("c", new st());
		map2.put("d", new st());
		System.out.println(map2);
		System.out.println(map2.get("a").num);

	}
}

class st {

	public int	num;
	public String str;

	public st() {

		// TODO Auto-generated constructor stub
		num = 0;
		str = "dfs";
	}
}