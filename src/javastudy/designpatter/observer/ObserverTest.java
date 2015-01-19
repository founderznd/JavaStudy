package javastudy.designpatter.observer;


public class ObserverTest {

	public static void main(String[] args) {

		Watched girl = new ConcreteWatched();
		Watcher watcher1 = new ConcreteWatcher();
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		
		girl.addWatcher(watcher1);
		girl.addWatcher(watcher2);
		girl.addWatcher(watcher3);
		
		girl.notifyWatchers("�Һܿ���");
		
		girl.removeWatcher(watcher2);
		
		girl.notifyWatchers("��ˬ");
	}
}
