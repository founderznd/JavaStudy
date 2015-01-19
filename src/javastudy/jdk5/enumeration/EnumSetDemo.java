package javastudy.jdk5.enumeration;

import java.util.EnumSet;

enum FontConstant{
	Plain,Bold,Italilc,Hello;
}

public class EnumSetDemo {

	public static void main(String[] args) {

		EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain,FontConstant.Bold);
		
		showEnumSet(enumSet);
		System.out.println("--------");
		showEnumSet(EnumSet.complementOf(enumSet));
	}
	
	public static void showEnumSet(EnumSet<FontConstant> enumSet) {
		
		for (FontConstant fontConstant : enumSet) {
			System.out.println(fontConstant);
		}
	}
}
