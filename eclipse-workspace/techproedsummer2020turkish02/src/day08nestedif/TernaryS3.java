package day08nestedif;

import java.util.Scanner;

public class TernaryS3 {

	public static void main(String[] args) {
		/*
	    Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. 
		Eðer urun miktarý 1000 den fazla ise
        Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana yazdýrýn. 
        Diðer durumlarda ödemesi gereken toplam parayý 
        herhangi bir indirim yapmadan ekrana yazdýrýn.
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
