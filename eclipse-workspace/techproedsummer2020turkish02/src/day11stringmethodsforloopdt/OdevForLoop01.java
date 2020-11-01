package day11stringmethodsforloopdt;

import java.util.Scanner;

public class OdevForLoop01 {

	public static void main(String[] args) {
		//Kullanicidan baslangic ve bitis degeri alip tum sayilari ekrana yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Baslangic degeri giriniz.");
		int baslangic = scan.nextInt();
		System.out.println("Bitis degeri giriniz.");
		int bitis  = scan.nextInt();
		
		for (int i=baslangic ; i<=bitis ; i++) {
			System.out.println(i);}
		
		//Cift sayilar
		for (int i=baslangic ; i<=bitis ; i++)
			if (i%2==0) {
				System.out.println(i);}
			
		
		//  3 e bolunen sayilari yazdirin
		
		for (int i=baslangic ; i<=bitis ; i++)
		if (i%3==0) {
			System.out.println(i);}
		
		scan.close();
	}

}
