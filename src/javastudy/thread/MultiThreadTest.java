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
		if (myId == -1) {//如果没有赋予id，则自动分配
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
		 * 要想synchronized起作用，不同的thread需要使用同一个instance才行，如果使用多个instance，
		 * 则synchronized无效，因为实际上相当于不同的函数了。
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
