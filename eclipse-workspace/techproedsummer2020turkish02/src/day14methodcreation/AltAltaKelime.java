package day14methodcreation;

import java.util.Scanner;

public class AltAltaKelime {
	
	public static void main(String[] args) {
		/*
		 Kullaniciya bir String girmesini soyleyin ve 
		 bu String i yukaridan asagiya dogru yazdiran kodu yaziniz.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Bitte schreiben Sie ein Wort.");
		String linie = input.nextLine();
		
		schrieb(linie);
		
		input.close();
	}
	public static void schrieb(String linie) {
	String i = linie.toUpperCase();
		do {
			System.out.println(i.charAt(0));
			i = i.substring(1);
		}while(i.length()!=0);
	}
}
