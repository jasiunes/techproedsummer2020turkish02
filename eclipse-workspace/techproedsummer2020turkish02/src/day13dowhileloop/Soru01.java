package day13dowhileloop;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		 /*Kullanicidan baslangic ve bitis degerlerini aliniz.
		baslangictan bitise kadar olan tum sayilarin carpimini ekrana yazdirin.*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Baslangic degeri giriniz.");
		int baslangic = scan.nextInt();
		System.out.println("Bitis degeri giriniz.");
		int bitis  = scan.nextInt();
		
		int product = 1;
		while(baslangic<=bitis ) {
			product = product*baslangic;
			baslangic++;}
		
		System.out.println(product);
		scan.close();

	}

}
