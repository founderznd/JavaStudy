package javastudy.jdk5.enumeration;

import java.util.EnumMap;
import java.util.Map;


public class EnumMapTest {
	
	public static void main(String[] args) {

		Map<Action, String> map = new EnumMap<Action, String>(Action.class);
		
		map.put(Action.SHOOT, "shoot");
		map.put(Action.TURN_LEFT, "turn left");
		map.put(Action.TURN_RIGHT, "turn right");
		
		for (Action action : Action.values()) {
			System.out.println(map.get(action));
		}
	}
}

enum Action{
	TURN_LEFT,TURN_RIGHT,SHOOT
}
