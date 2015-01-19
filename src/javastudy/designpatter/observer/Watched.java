package javastudy.designpatter.observer;

/*
 * 在观察者模式中，需要一个虚拟观察主题（被观察对象）
 * 它可以添加观察者，删除观察者，通知观察者自己的变化
 */
public interface Watched {

	public void addWatcher(Watcher watcher);
	public void removeWatcher(Watcher watcher);
	public void notifyWatchers(String str);
}
