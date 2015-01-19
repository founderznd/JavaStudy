package javastudy.jdk5.enumeration;

public class EnumTest {

	public static void doOp(OpConstant opConstant) {
		switch (opConstant) {
		case TURN_LEFT:
			System.out.println("向左转");
			break;
		case TURN_RIGHT:
			System.out.println("向右转");
			break;
		case SHOOT:
			System.out.println("射击");
		default:
			break;
		}
	}
	
	
	public static void main(String[] args) {
		doOp(OpConstant.SHOOT);
		doOp(OpConstant.TURN_LEFT);
		doOp(OpConstant.TURN_RIGHT);
		
		for (OpConstant op : OpConstant.values()) {
			System.out.println(op);
		}
	}
}

enum OpConstant{
	TURN_LEFT,TURN_RIGHT,SHOOT
}