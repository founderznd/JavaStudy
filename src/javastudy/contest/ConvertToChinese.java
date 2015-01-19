package javastudy.contest;

import java.util.HashMap;

public class ConvertToChinese {

	private String str;

	public ConvertToChinese() {

		str = null;
	}

	public ConvertToChinese(String str) {

		this.str = str;
	}

	private void convertNum(Integer num) {

		/*
		 * 关键点1：映射 有的方法用枚举，也行。
		 */
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "零");
		map1.put(1, "一");
		map1.put(2, "二");
		map1.put(3, "三");
		map1.put(4, "四");
		map1.put(5, "五");
		map1.put(6, "六");
		map1.put(7, "七");
		map1.put(8, "八");
		map1.put(9, "九");

		/*
		 * 关键点2： 单位的映射分两种情况 后面没有零的是一种map2 后面有零的是另外一种map3
		 */
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(2, "十");
		map2.put(3, "百");
		map2.put(4, "千");
		map2.put(5, "万");
		map2.put(6, "十");
		map2.put(7, "百");
		map2.put(8, "千");
		map2.put(9, "亿");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(2, "十");
		map3.put(3, "百");
		map3.put(4, "千");
		map3.put(5, "万");
		map3.put(6, "十万");
		map3.put(7, "百万");
		map3.put(8, "千万");
		map3.put(9, "亿");

		int n = 0;

		int tmp0 = num.intValue();

		while (0 < tmp0) {
			tmp0 = tmp0 / 10;
			n++;
		}

		for (int i = n; i > 1; i--) {

			int k = 1;
			for (int j = 0; j < i - 1; j++) {
				k = k * 10;
			}
			int tmp = num / k;
			num = num % k;

			/*
			 * 关键点3： 需要讨论当前位置的后一位 如果后一位是零，则需要用第二套单位 如果后一位非零，则用第一套单位
			 */
			int vk = k / 10;
			int vtmp = num / vk;

			if (0 != tmp && 0 != vtmp)
				System.out.print(map1.get(tmp) + map2.get(i));
			if (0 != tmp && 0 == vtmp) {
				if (0 != num)
					System.out.print(map1.get(tmp) + map3.get(i) + "零");
				else
					System.out.print(map1.get(tmp) + map3.get(i));
			}
		}

		if (0 != num) {
			System.out.println(map1.get(num));
		}
	}

	public void doTheConvert() {

		System.out.println(str);
		try {

			Integer num = Integer.valueOf(str);
			System.out.println(num);
			convertNum(num);
		}
		catch (NumberFormatException e) {

			System.out.println("用户输入的字符不都为数字，无法转换。");
			return;
		}
	}

	public static void main(String[] args) {

		if (0 == args.length) {
			System.out.println("请输入一串数字");
			return;
		}

		ConvertToChinese convert = new ConvertToChinese(args[0]);
		convert.doTheConvert();

	}
}
