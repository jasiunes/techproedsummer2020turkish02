package day12forvewhileloop;

import java.util.Scanner;

public class OdevWhileLoop06 {

	public static void main(String[] args) {
		/*Kullan�c�dan ba�lang�� ve biti� harflerini al�niz.
		  Ba�lang�� harfinden ba�lay�p biti� harfinde
		biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n. 
		Kullan�c�n�n hata yapmad���n� farz edin.*/
				
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
