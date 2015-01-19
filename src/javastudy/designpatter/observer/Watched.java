package javastudy.designpatter.observer;

/*
 * �ڹ۲���ģʽ�У���Ҫһ������۲����⣨���۲����
 * ��������ӹ۲��ߣ�ɾ���۲��ߣ�֪ͨ�۲����Լ��ı仯
 */
public interface Watched {

	public void addWatcher(Watcher watcher);
	public void removeWatcher(Watcher watcher);
	public void notifyWatchers(String str);
}
