/**
 * @author Nandi Zhou
 * 2015年4月25日
 * 关键字 synchronized  线程锁
 * 关键点：线程锁只针对同一个对象有效
 */
package javastudy.thread;

public class FetchMoney {

	public static void main(String[] args) {

		Runnable bank = new FetchThread(new Bank());//装饰模式哦~~^-^

		Thread t1 = new Thread(bank, "柜台");
		Thread t2 = new Thread(bank, "取款机");
		Thread t3 = new Thread(new FetchThread(new Bank()), "金库");

		t1.start();
		t2.start();
		t3.start();
	}
}

class Bank {

	private int money = 1000;

	/*
	 * 同步方法
	 */
	public synchronized int getMoney() {

		return money;
	}

	public synchronized int getMoney(int n) {

		System.out.println(Thread.currentThread().getName() + "正在取钱，请等待");
		if (n < 0) {
			return -1;
		}
		else if (n > money) {
			return -2;
		}
		else {

			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}

			money -= n;
			return n;
		}
	}
}

class FetchThread implements Runnable {

	private Bank bank;

	public FetchThread(Bank b) {

		this.bank = b;
	}

	@Override
	public synchronized void run() {

		System.out.println("您从" + Thread.currentThread().getName() + "取得" + " " + bank.getMoney(800) + "，您还有 " + bank.getMoney());
	}
}
