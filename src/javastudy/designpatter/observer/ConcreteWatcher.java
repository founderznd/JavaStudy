package javastudy.designpatter.observer;

public class ConcreteWatcher implements Watcher {

	@Override
	public void update(String str) {

		System.out.println(this.getClass().getSimpleName() + ": " + str);
	}

}
