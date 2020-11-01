package day10stringmethods;

public class StringMethodsSlide02 {

	public static void main(String[] args) {
		//
		String strA = "Cat ";
		System.out.println(strA.trim());
		String strB = " Cat";
		System.out.println(strB.trim());
		String strC = " Cat ";
		System.out.println(strC.trim());
		
		
		String str1 = "Cat ";
		System.out.println(str1.contains("a"));
		String str2 = " Cat";
		System.out.println(str2.contains(" "));
		String str3 = " Cat ";
		System.out.println(str3.contains(" "));
		
		
		
	}

}
