package day08nestedif;

import java.util.Scanner;

public class TernaryS1 {

	public static void main(String[] args) {
		// //Kullan�c�dan bir tamsay� al�n e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n.
		//Di�er durumlarda ekrana �Negatif degil� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int s = scan.nextInt();
		
		String result = s<0  ? "Negatif" : "Negatif degil";
		System.out.println(result);
		scan.close();
	}

}
