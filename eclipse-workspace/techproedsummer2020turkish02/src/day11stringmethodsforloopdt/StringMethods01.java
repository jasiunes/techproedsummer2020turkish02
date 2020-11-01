package day11stringmethodsforloopdt;

public class StringMethods01 {

	public static void main(String[] args) {
		// 11. startsWith() methodu ilk characteri kontrol eder.
		String a = "Hadi gidelim bu diyardan!";
		System.out.println(a.startsWith("H"));
		System.out.println(a.startsWith(""));
		System.out.println(a.startsWith("Hadi"));
		
		System.out.println(a.startsWith("g",5));//true
		System.out.println(a.startsWith("i",7));//false
		System.out.println(a.startsWith("",6));//true

	    //12. indexOf() methodu ilk gorunumun indexini verir.
		 //indexOf() methodunda hem String hem de char da kullanabiliriz.
		System.out.println(a.indexOf("i")); //3
		System.out.println(a.indexOf('d')); 
		//Birden fazla character kullanirsaniz Java ilk harfin index'ini return eder.
		System.out.println(a.indexOf("deli"));
		//Olmayan bir character icin indexOf() kullanirsaniz Java "-1" return eder.
		
		System.out.println(a.indexOf("x")); //-1
		System.out.println(a.indexOf("diyer"));//-1
		System.out.println(a.indexOf('w'));//-1
		
		System.out.println(a.indexOf("d",4)); //7 => 4.characterden sonra d nerede?
		System.out.println(a.indexOf("a",9)); //19
		System.out.println(a.indexOf('e',8)); //8cha
		
		//12.lastIndexOf()
		String b = "Java ah Java";
		System.out.println(b.lastIndexOf("v")); //10 Son index 
		// Birden fazla character yazyarsaniz Son gorunumu bulur 
		//ilk harfin indexi basar
		System.out.println(b.lastIndexOf("av")); //9
		
		//14. substring()bir String'in belli bir bolumunu kesip almaya yarar.(Onemli!)
		String c = "Karakartal";
		System.out.println(c.substring(4)); //kartal 4'den keser
		System.out.println(c.substring(1)); //arakartal
		// substring() methodundaiki sayi kullanirsaniz ilk sayi dahil ikinci haric olur.
		System.out.println(c.substring(4, 7)); //kar
		
		// substring() methodunda ilk harf icin 0,1 kullaniriz.
		System.out.println(c.substring(0, 1)); 
		// ayni yazarsaniz hibirsey alamazsiniz
		System.out.println(c.subSequence(2,2));
		//Baslangic stringi bitisden kucuk olamaz Run Time Error alirsiniz
		//System.out.println(c.subSequence(5, 3));
		
		//15. trim() methodu bir STRING IN BAS VE SON TARAFLARDAKI space leri siler.
	// Dikkat bas ve son aradaki space leri degil.
		String d ="  Java iyidir   ";
		System.out.println(d.length());//16
		System.out.println(d.trim().length());//11
		
		
		
		
		
		
	}
}
