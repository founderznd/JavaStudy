package javastudy.jdk5.enumeration;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class EnumSetDemo3 {

	public static void main(String[] args) {

		List<FontConstant> list = new ArrayList<FontConstant>();
		
		list.add(FontConstant.Bold);
		list.add(FontConstant.Plain);
		list.add(FontConstant.Italilc);
		
		showEnumSet(EnumSet.copyOf(list));
		
	}
	
	public static void showEnumSet(EnumSet<FontConstant> enumSet) {
		
		for (FontConstant constant : enumSet) {
			System.out.println(constant);
		}
	}
}
