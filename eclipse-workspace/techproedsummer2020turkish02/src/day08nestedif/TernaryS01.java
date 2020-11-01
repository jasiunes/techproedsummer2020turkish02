package day08nestedif;

import java.util.Scanner;

public class TernaryS01 {

	public static void main(String[] args) {
		/* Kullanýcýdan bir tamsayý girmesini isteyin, tamsayý çift ise ekrana
		  “Çift” tek ise ekrana “Tek” yazdýrýn.*/

Scanner scan = new Scanner (System.in);
int s = scan.nextInt();
String result = (s%2==0) ? "Cift sayi" : "Tek sayi";
System.out.println(result);
scan.close();
	}

}
