package day11stringmethodsforloopdt;

import java.util.Scanner;

public class ForLoopSoru01 {

	public static void main(String[] args) {
		// Toplam ve carpimi yazdirin
		Scanner scan = new Scanner (System.in);
		System.out.println("Baslangic degeri giriniz.");
		int baslangic = scan.nextInt();
		System.out.println("Bitis degeri giriniz.");
		int bitis  = scan.nextInt();
		int t =0;
		int c =1;
	   
		for (int i=baslangic ; i<=bitis ; i++) { 
		t = t+i;
		System.out.println(t);
	}
	
		for (int i=baslangic ; i<=bitis ; i++) { 
			c = c*i;
			System.out.println(c);
		}
		scan.close();
	}

}
