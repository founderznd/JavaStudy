package javastudy.ide;

public class Test {

	public boolean canAccess(int access) {

		if (access == Authorization.MANAGER) {
			return true; // 经理访问权限。
		}
		if (access == Authorization.DEPARTMENT) {
			return false; // 经理访问权限。
		}
		if (access == Authorization.EMPLOYEE) {
			return false; // 经理访问权限。
		}
		return false;
	}
}
