package day14methodcreation;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		/*
		 Kullaniciya sayi girmesini söyleyin. Kullanicinin girdigi sayinin 
		 rakamlari toplamini ekrana yazdiran bir program yazin.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Geben Sie eine Nummer ein.");
		int num = input.nextInt();
		
		summe(num);
		input.close();
	}
	
	public static void summe(int num) {
		int sum = 0;
		do {
			int i=num%10;
			sum = sum + i;
			num = num/10;
		}while(num!=0);
		System.out.println("Summe der Zahlen ="+ sum);
	
	}
}