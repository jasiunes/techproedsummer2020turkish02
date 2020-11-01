package day08nestedif;

import java.util.Scanner;

public class TernaryS1 {

	public static void main(String[] args) {
		// //Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
		//Diðer durumlarda ekrana “Negatif degil” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int s = scan.nextInt();
		
		String result = s<0  ? "Negatif" : "Negatif degil";
		System.out.println(result);
		scan.close();
	}

}
