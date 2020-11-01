package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
/*Kullanýcýdan bir üçgenin  üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
“Eþkenar üçgen” yazdýrýn. 
Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin üc kenar uzunlugunu giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		String result = k1==k2&& k1==k3 ? "ESKENAR UCGEN" : "ESKENAR UCGEN DEGIL";
		System.out.println(result);
scan.close();
	}

}
