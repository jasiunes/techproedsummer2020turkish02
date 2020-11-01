package day08nestedif;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		// Ternary, if-else'in daha kisa yazilmis halidir.
		
		//if-else kullandik
		if (5>4) {System.out.println("Elma");} else {System.out.println("Armut");}
		
		//Ternary kullandik
		String result = 5>4 ? "Elma" : "Armut";
		System.out.println(result);
		 
		/*
		 Kullanicidan bir sayi alin
		 Bu sayi 0 dan 9 a kadar ise ekrana rakam yazdirin
		 Diger durumlarda ekrana sayi yazdirin
		 Bu soruyu Ternary ile cozun
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
		
		String result1 = s<10 && s>=0 ? "rakam" : "sayi";
		System.out.println(result1);
		scan.close();
	}

}
