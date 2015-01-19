package javastudy.jdk5.enumeration;

public class AccessControl {

	public static boolean checkRight(AccessRight right) {
		
		if (right == AccessRight.MANAGER) {
			return true;
		}
		else if (right == AccessRight.DEPARTMENT) {
			 return false;
		}
		return false;
	}
	
	public static void main(String[] args) {

		AccessRight right = AccessRight.valueOf("MANAGER");
		System.out.println(checkRight(right));
	}
}
