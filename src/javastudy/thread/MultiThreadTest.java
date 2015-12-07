package javastudy.thread;

class MultiThreadTest implements Runnable {

	int myId;

	public MultiThreadTest() {
		myId = -1;
	}

	public MultiThreadTest(int id) {
		myId = id;
	}

	@Override
	public synchronized void run() {
		if (myId == -1) {//���û�и���id�����Զ�����
			for (int i = 0; i < 3; i++) {
				myId = i;
				System.out.println("myId is " + i + " : " + Thread.currentThread().getName());
			}
		} else {
			for (int i = 0; i < 3; i++) {
				System.out.println("myId is " + i + " : " + Thread.currentThread().getName());
			}
		}
	}

	public static void main(String[] args) {

		/*
		 * Ҫ��synchronized�����ã���ͬ��thread��Ҫʹ��ͬһ��instance���У����ʹ�ö��instance��
		 * ��synchronized��Ч����Ϊʵ�����൱�ڲ�ͬ�ĺ����ˡ�
		 */
		 new Thread(new MultiThreadTest(1)).start();
		 new Thread(new MultiThreadTest(2)).start();
		 new Thread(new MultiThreadTest(3)).start();
//
//		Runnable r = new MultiThreadTest();
//
//		new Thread(r).start();
//		new Thread(r).start();
//		new Thread(r).start();

	}
}
