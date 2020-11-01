package day10stringmethods;

public class StringMethodsSlide10 {

	public static void main(String[] args) {
		String str = "Cat,caterpiller";
		System.out.println(str.indexOf("c")); //4
		System.out.println(str.indexOf("cat"));//4
		System.out.println(str.indexOf("s"));//-1
		System.out.println(str.indexOf("CAT"));//-1
		System.out.println(str.indexOf("ter"));//6
		System.out.println(str.indexOf("pars"));//-1
		
		System.out.println(str.indexOf("a",3));  //5
		System.out.println(str.indexOf("at",2)); //5
		System.out.println(str.indexOf("at",8)); //-1"(!!8.characterden sonra "at" yok)
		
		System.out.println(str.lastIndexOf("a")); //5
		System.out.println(str.lastIndexOf("at")); //5
		System.out.println(str.lastIndexOf("s"));//-1
		System.out.println(str.lastIndexOf("CAT"));//-1
		System.out.println(str.lastIndexOf("pars"));//-1
		System.out.println(str.lastIndexOf("at",2));//1
		System.out.println(str.lastIndexOf("at",7)); //5
		
		String str1 ="";
		System.out.println(str1.isEmpty()); //true
		String str2 ="";
		System.out.println(str2.isEmpty());//true
		String str3 ="Almanya";
		System.out.println(str3.isEmpty());//false
		
		System.out.println(str.toUpperCase()); //CAT,CATERPÝLLER
		System.out.println(str.toLowerCase()); //cat,caterpiller
		
		System.out.println(str.substring(4).toLowerCase());//caterpiller
		System.out.println(str.substring(3,8).toUpperCase()); //,CATE
		System.out.println(str.toUpperCase().toLowerCase()); //cat,caterpiller
		
		String strA= "Cat";
		System.out.println(strA.trim());//Cat space leri trasladi
		String strB= "  Cat";
		System.out.println(strB.trim());//Cat
		String strC= "  Cat  ";
		System.out.println(strC.trim());//Cat
		
		String strx= "Cat";
		System.out.println(strx.contains("a")); //true
		String stry= "  Cat";
		System.out.println(stry.contains(" ")); //true
		String strz= "  Cat  ";
		System.out.println(strz.contains(""));  //true
		
		
	
		
	}

}
