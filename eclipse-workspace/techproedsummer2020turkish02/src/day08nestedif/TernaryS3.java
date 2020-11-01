package day08nestedif;

import java.util.Scanner;

public class TernaryS3 {

	public static void main(String[] args) {
		/*
	    Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. 
		E�er urun miktar� 1000 den fazla ise
        Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n. 
        Di�er durumlarda �demesi gereken toplam paray� 
        herhangi bir indirim yapmadan ekrana yazd�r�n.
	    */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen alacaginiz urun miktarini giriniz");
		int miktar = scan.nextInt();
		
		System.out.println("Lutfen alacaginiz urunun birim fiyatini giriniz");
		double fiyat = scan.nextDouble();
		
		double result = miktar>1000 ? ( (miktar*fiyat)-(miktar*fiyat)*0.1) : (miktar*fiyat);
		System.out.println(result);
		scan.close();
	}

}
