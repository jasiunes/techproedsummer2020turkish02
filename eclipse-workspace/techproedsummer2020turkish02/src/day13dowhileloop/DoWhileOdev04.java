package day13dowhileloop;

import java.util.Scanner;

public class DoWhileOdev04 {
	public static void main(String[] args) {
		//Kullan�c�ya iki say� girmesini s�yleyin. Bu say�lar e�it ise ekrana �Kare olu�turdunuz� yazd�r�n. 
		//E�it de�ilse tekrar iki say� girmesini s�yleyin.
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
