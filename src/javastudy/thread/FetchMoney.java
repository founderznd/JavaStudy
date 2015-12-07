/**
 * @author Nandi Zhou
 * 2015��4��25��
 * �ؼ��� synchronized  �߳���
 * �ؼ��㣺�߳���ֻ���ͬһ��������Ч
 */
package javastudy.thread;

public class FetchMoney {

	public static void main(String[] args) {

		Runnable bank = new FetchThread(new Bank());//װ��ģʽŶ~~^-^

		Thread t1 = new Thread(bank, "��̨");
		Thread t2 = new Thread(bank, "ȡ���");
		Thread t3 = new Thread(new FetchThread(new Bank()), "���");

		t1.start();
		t2.start();
		t3.start();
	}
}

class Bank {

	private int money = 1000;

	/*
	 * ͬ������
	 */
	public synchronized int getMoney() {

		return money;
	}

	public synchronized int getMoney(int n) {

		System.out.println(Thread.currentThread().getName() + "����ȡǮ����ȴ�");
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

		System.out.println("����" + Thread.currentThread().getName() + "ȡ��" + " " + bank.getMoney(800) + "�������� " + bank.getMoney());
	}
}
