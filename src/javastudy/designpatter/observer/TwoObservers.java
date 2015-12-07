/**
 * 
 */
package javastudy.designpatter.observer;

import java.util.Observable;
import java.util.Observer;

class BeingWatched extends Observable {

	void counter(int number) {

		for (; number >= 0; number--) {
			this.setChanged();
			this.notifyObservers(number);
		}
	}
}

class WatcherOne implements Observer {

	@Override
	public void update(Observable o, Object arg) {

		System.out.println("by w1 count is: " + arg);
	}
}

class WatcherTwo implements Observer {

	@Override
	public void update(Observable o, Object arg) {

		if ((Integer) arg <= 5) {
			System.out.println("by w2 count is: " + arg);
		}
	}
}

/**
 * @author Nandi Zhou
 *
 */
public class TwoObservers {

	public static void main(String[] args) {

		BeingWatched bw = new BeingWatched();

		WatcherOne w1 = new WatcherOne();
		WatcherTwo w2 = new WatcherTwo();

		bw.addObserver(w1);
		bw.addObserver(w2);

		bw.counter(10);

	}
}
