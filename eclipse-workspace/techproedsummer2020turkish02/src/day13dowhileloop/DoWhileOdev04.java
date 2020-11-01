package day13dowhileloop;

import java.util.Scanner;

public class DoWhileOdev04 {
	public static void main(String[] args) {
		//Kullanýcýya iki sayý girmesini söyleyin. Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn. 
		//Eþit deðilse tekrar iki sayý girmesini söyleyin.
		Scanner scan = new Scanner (System.in);
		System.out.println("Iki sayi giriniz.");
		
		int s1=0;
		int s2=0;
		do {
			if(s1!=s2) {System.out.println("Kare olusturulamadi!Iki sayi daha giriniz!");}
			s1=scan.nextInt();
			s2=scan.nextInt();
			} while (s1!=s2);
				System.out.println("Kare olusturdunuz.");
				
		scan.close();
	}

}
