package day11stringmethodsforloopdt;

import java.util.Scanner;

public class OdevForLoopHarf {

	public static void main(String[] args) {
		/*Kullan�c�dan ba�lang�� ve biti� harflerini al�n ve ba�lang�� harfinden ba�lay�p biti� harfinde
 biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n.*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Baslangic harfini giriniz.");
		char baslangic = scan.next().toUpperCase().charAt(0);
		System.out.println("Bitis harfini giriniz.");
		char bitis = scan.next().toUpperCase().charAt(0);
		
		for (char i=baslangic ; i <= bitis ; i++) {
		System.out.print(i);}
		
        
        scan.close();
	}

}
