package day12forvewhileloop;

import java.util.Scanner;

public class OdevWhileLoop02 {

	public static void main(String[] args) {
		/*Kullanicidan baslangic ve bitis degerlerini aliniz.
		baslangictan bitise kadar olan tum sayilari ekrana yazdiriniz.*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Baslangic degeri giriniz.");
		int baslangic = scan.nextInt();
		System.out.println("Bitis degeri giriniz.");
		int bitis  = scan.nextInt();
		
		int i=baslangic;
		while ( i<=bitis) {
			System.out.println(i+"");
			 i++;}
		scan.close();
	}

}
