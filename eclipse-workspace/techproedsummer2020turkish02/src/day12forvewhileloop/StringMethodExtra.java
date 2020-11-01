package day12forvewhileloop;

import java.util.Scanner;

public class StringMethodExtra {

	public static void main(String[] args) {
		/* Kullanýcýdan uzunluðu çift sayý olan bir String alýn ve bu String’in ilk yarýsýný ekrana yazdýrýn.
		Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl” yazdýracaksýnýz.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Cift character den olusan bir kelime giriniz");
		String s = scan.nextLine();
		
		if (s.length()%2==0) {
			System.out.println(s.substring(0, s.length()/2));
		}else {
			System.out.println("Yazýnýn uzunluðu çift olmalý...");
		}
		/*5)Kullanýcýdan bir String alýn ve bu String’in ilk harfi ile son harfinin yerlerini deðiþtirerek
		ekrana yazdýrýn.
		Ornegin; Kullanýcý “Java” girerse ekrana “aavJ” yazdýracaksýnýz.
		*/
		char ilkHarf=s.charAt(0);
		char sonHarf=s.charAt(s.length()-1);
		
		System.out.println(sonHarf+s.substring(1,s.length()-2)+ilkHarf);

		/*6)Kullanýcýdan bir String alýn ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün
		indexini ekrana yazdýrýn. “a” harfi yoksa ekrana “a harfi yok” yazdýrýn.
		*/
		if (s.contains("a")) {
			System.out.println(s.indexOf("a"));
		}else {
			System.out.println("a yok");
		}	

		
		scan.close();
	}

}
