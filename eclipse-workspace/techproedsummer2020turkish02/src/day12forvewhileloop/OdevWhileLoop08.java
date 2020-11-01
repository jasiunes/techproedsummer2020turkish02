package day12forvewhileloop;

import java.util.Scanner;

public class OdevWhileLoop08 {

	public static void main(String[] args) {
		 	/*Kullanicidan baslangic ve bitis harflerini aliniz.
		baslangictan bitise kadar olan tum harfleri ekrana yazdiriniz.*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Baslangic harfini giriniz.");
		char baslangic = scan.next().toUpperCase().charAt(0);
		System.out.println("Bitis harfini giriniz.");
		char bitis = scan.next().toUpperCase().charAt(0);
		
		char i=baslangic;
		while ( i<=bitis) {
			System.out.print(i+" ");
			 i++;}
		scan.close();
		
	}

}
