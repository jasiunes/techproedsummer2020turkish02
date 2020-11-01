package day14methodcreation;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan iki sayi alin bu sayilar esit ise ekrana “Esit”,
		  birinci sayi büyük ise ekrana“Birinci sayi büyük”, 
		  ikinci sayi büyük ise ekrana “Ikinci sayi büyük” yazdiriniz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("	Erste Nummer= ");
		double num1 = scan.nextDouble();
		System.out.print("Zweite Nummer= ");
		double num2 = scan.nextDouble();
		
		vergleichen(num1, num2);
		scan.close();
	}
	
	public static void vergleichen(double num1, double num2) {
		if (num1==num2) {
			System.out.println("Zahlen sind gleich!");
		}else if(num1>num2) {
			System.out.println("Die erste Nummer is größer.");
		}else {
			System.out.println("Die zweite Nummer is groter.");
		}
		
	}
}

