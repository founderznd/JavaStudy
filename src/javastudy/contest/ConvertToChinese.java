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
		 * �ؼ���1��ӳ�� �еķ�����ö�٣�Ҳ�С�
		 */
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "��");
		map1.put(1, "һ");
		map1.put(2, "��");
		map1.put(3, "��");
		map1.put(4, "��");
		map1.put(5, "��");
		map1.put(6, "��");
		map1.put(7, "��");
		map1.put(8, "��");
		map1.put(9, "��");

		/*
		 * �ؼ���2�� ��λ��ӳ���������� ����û�������һ��map2 ���������������һ��map3
		 */
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(2, "ʮ");
		map2.put(3, "��");
		map2.put(4, "ǧ");
		map2.put(5, "��");
		map2.put(6, "ʮ");
		map2.put(7, "��");
		map2.put(8, "ǧ");
		map2.put(9, "��");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(2, "ʮ");
		map3.put(3, "��");
		map3.put(4, "ǧ");
		map3.put(5, "��");
		map3.put(6, "ʮ��");
		map3.put(7, "����");
		map3.put(8, "ǧ��");
		map3.put(9, "��");

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
			 * �ؼ���3�� ��Ҫ���۵�ǰλ�õĺ�һλ �����һλ���㣬����Ҫ�õڶ��׵�λ �����һλ���㣬���õ�һ�׵�λ
			 */
			int vk = k / 10;
			int vtmp = num / vk;

			if (0 != tmp && 0 != vtmp)
				System.out.print(map1.get(tmp) + map2.get(i));
			if (0 != tmp && 0 == vtmp) {
				if (0 != num)
					System.out.print(map1.get(tmp) + map3.get(i) + "��");
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

			System.out.println("�û�������ַ�����Ϊ���֣��޷�ת����");
			return;
		}
	}

	public static void main(String[] args) {

		if (0 == args.length) {
			System.out.println("������һ������");
			return;
		}

		ConvertToChinese convert = new ConvertToChinese(args[0]);
		convert.doTheConvert();

	}
}
