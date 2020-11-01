package day12forvewhileloop;

import java.util.Scanner;

public class OdevWhileLoop06 {

	public static void main(String[] args) {
		/*Kullanýcýdan baþlangýç ve bitiþ harflerini alýniz.
		  Baþlangýç harfinden baþlayýp bitiþ harfinde
		biten tüm harfleri büyük harf olarak ekrana yazdýrýn. 
		Kullanýcýnýn hata yapmadýðýný farz edin.*/
				
				Scanner scan = new Scanner (System.in);
				System.out.println("Baslangic harfini giriniz");
				char baslangic=scan.next().toUpperCase().charAt(0);
				System.out.println("Bitis degerini giriniz");
				char bitis=scan.next().toUpperCase().charAt(0);
				
				char ch=baslangic;
				int sum=0;
				while (ch<=bitis) {
					sum=sum+ch;
					System.out.print(ch+" ");
					ch++;
				}
				scan.close();


	}

}
