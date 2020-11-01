package day14methodcreation;

import java.util.Scanner;

public class AlanKareDik {

	public static void main(String[] args) {
		/* Kullanýcýya paralelkenar, dikdörtgen ve 
		   üçgen kelimelerinden birini ve iki sayý
		   seçmesini söyleyin. 
		   Hangi þekli seçerse, o þeklin alanýný ve
		   çevresini ekrana yazdýran programý yazýnýz.
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("Asagidaki sekillerden birini seciniz \n 1-Paralelkenar \n 2-Dikdörtgen \n 3-Ucgen");
		String sekil =input.nextLine();
	
	
		System.out.println("Iki sayi giriniz");
		int say1 = input.nextInt();
		int say2 = input.nextInt();

		cevreVeAlanHesabi(sekil,say1,say2 );
		
		input.close();
	}
	public static void cevreVeAlanHesabi(String sekil,int say1,int say2 ) {
		
		
		switch(sekil) {
		case "1":
			System.out.println("Paralel Kenarin cevresi : " + ((say1+say2)*2));
			System.out.println("Paralel Kenarin  Alani : " + (say1*say2));
			break;
		
		case "2":
			System.out.println("Dikdorgenin Kenarin cevresi: " + ((say1+say2)*2));
			System.out.println("Dikdortgenin  Kenarin  Alani: " + (say1*say2));
			break;
			
		case "3":
			System.out.println("Ucgenin Cevresi : " + (say1+say2+say1));
			System.out.println("Ucgenin Alani : " + (say1*say2)/2);
			break;
		    default:
			System.out.println("Hatalý giris");
	       
			
		}
		
		}
}
