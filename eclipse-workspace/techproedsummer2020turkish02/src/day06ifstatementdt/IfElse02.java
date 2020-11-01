package day06ifstatementdt;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		/*Kullanicidan ucgenin uzunluklarini aliniz.
				Uzunluklar esit ise ekrana "Eskenar Ucgen", diger
			durumda "Eskenar ucgen degil" yazdiriniz.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen A kenar uzunlugu giriniz.");
		int a = scan.nextInt();
		System.out.println("Lutfen B kenar uzunlugu giriniz.");
		int b = scan.nextInt();
		System.out.println("Lutfen C kenar uzunlugu giriniz.");
		int c = scan.nextInt();
	
		if (a==b && a==c) {
		System.out.println("Eskenar ucgen");
		}
		else {
		System.out.println("Eskenar degil");
		
		scan.close();
		}}
	
	


}
