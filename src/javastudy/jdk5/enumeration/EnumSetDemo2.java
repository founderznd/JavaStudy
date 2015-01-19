package javastudy.jdk5.enumeration;

import java.util.EnumSet;
import java.util.Iterator;


public class EnumSetDemo2 {

	public static void main(String[] args) {

		EnumSet<FontConstant> enumSet = EnumSet.noneOf(FontConstant.class);

		enumSet.add(FontConstant.Italilc);
		enumSet.add(FontConstant.Bold);
		
		showEnumSet(enumSet);
		
	}
	
	public static void showEnumSet(EnumSet<FontConstant> enumSet) {
		/*
		 * 两个方法一样的
		 */
		for (FontConstant fontConstant : enumSet) {
			System.out.println(fontConstant);
		}
		
		for (Iterator<FontConstant> iterator = enumSet.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}
}
