package day08nestedif;

import java.util.Scanner;

public class NestedIf05 {

	public static void main(String[] args) {
		/*Kullanýcýdan password girmesini isteyin.
         Girdiði password 5’e bölünüyorsa son rakamýný kontrol edin. 
         Son rakamý 0 ise ekrana “5’e bölünen çift sayý” yazdýrýn.
         Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.
         Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Password giriniz.");
		int pass = scan.nextInt();
		
		if (pass%5==0) {
			if (pass%10==0) {
		System.out.println("5'e bolunen cift sayi.");
			}else if( pass%10!=0) {System.out.println("5'e bolunen tek sayi.");}
			 else {System.out.println("Tekrar deneyin");}
		}

	}

}
