package javastudy.ide;

public class Test {

	public boolean canAccess(int access) {

		if (access == Authorization.MANAGER) {
			return true; // �������Ȩ�ޡ�
		}
		if (access == Authorization.DEPARTMENT) {
			return false; // �������Ȩ�ޡ�
		}
		if (access == Authorization.EMPLOYEE) {
			return false; // �������Ȩ�ޡ�
		}
		return false;
	}
}
