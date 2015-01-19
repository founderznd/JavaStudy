package javastudy.jdk5.varargs;

public class TestVarags {

	/*
	 * �ɱ�����������Ͼ���һ�����顣
	 * ����ĳ�������˿ɱ�����ķ�����˵�����Ǽ����Դ�����ɢ��ֵ��Ҳ���Դ����������
	 * ������������еĲ�������Ϊ���飬��ôֻ�ܴ���������ζ����ܴ�����ɢ��ֵ��
	 * �ɱ��������Ҫ��Ϊ���������һ����������һ�����������ܾ��ж������
	 */
	private static int sum(int... nums) {

		int sum = 0;

		for (int i : nums) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {

		int result = sum(1, 2, 3, 4, 5, 6);
		System.out.println(result);
	}
}
