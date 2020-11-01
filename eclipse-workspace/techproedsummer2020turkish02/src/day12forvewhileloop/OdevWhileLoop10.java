package day12forvewhileloop;

import java.util.Scanner;

public class OdevWhileLoop10 {

	public static void main(String[] args) {
		/*Kullanicidan baslangic ve bitis degerleri alin ve
		 *  baslangic degerinden baslayip bitis degerinde biten
		 *   3 ve 5 ile bolunebilen tum sayilari ekrana yazdirin
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Baslangic degeri giriniz.");
		int baslangic = scan.nextInt();
		System.out.println("Bitis degeri giriniz.");
		int bitis  = scan.nextInt();
		
		int i=1;
		i=baslangic;
	
		while (i<=bitis) {
			if (i%3==0 && i%5==0) {
			System.out.print(i+" ");
							}i++;}
		
		int k=1;
		for(k=baslangic;k<bitis;k++)
		if( k%3==0 && k%5==0) {
			System.out.println(k+"");
		scan.close();

	

		}}}
