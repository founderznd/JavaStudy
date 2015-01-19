package javastudy.designpatter.observer;

/*
 * 抽象观察者，就是事件处理器
 */
public interface Watcher {

	public void update(String str);
}
