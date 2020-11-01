package day08nestedif;

import java.util.Scanner;

public class TernaryS2 {

	public static void main(String[] args) {
		// //Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer iki kenar uzunluðu birbirine eþit ise ekrana
		//“Ikizkenar Ucgen” yazdýrýn. Diðer durumlarda ekrana “Ikizkenar deðil” yazdýrýn.
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin A-B-C kenar uzunluklarini giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		String result = (a==b) && (a!=c)|| (b==c) && (b!=a) || (a==c)&&(a!=b) ? "Ikiz Kenar Ücgen" : "Ikiz Kenar Ücgen degil";
		System.out.println(result);
		scan.close();
		
		
	}

}
