package day09nestedternary;

import java.util.Scanner;

public class SwitchS2 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan bir harf alýn eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
		“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn.
		Bu harflerin dýþýnda bir character için “Geçersiz character” yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char ch = scan.next().charAt(0);
		 switch (ch) {
		 case 'a':
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u':
			 System.out.println("Sesli harf");
		 break;
		 case 'b':
		 case 'c':
		 case 'd':
		 case 'f':
			 System.out.println("Sessiz harf");
		 break;
		 default:
			 System.out.println("Gecersiz Character");
		 }
scan.close();
	}

}
