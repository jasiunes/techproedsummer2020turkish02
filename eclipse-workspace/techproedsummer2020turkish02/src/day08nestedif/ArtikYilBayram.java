package day08nestedif;

import java.util.Scanner;

public class ArtikYilBayram {

	public static void main(String[] args) {
	/*	Kullan�c�dan bir y�l girmesini isteyin, y�l art�k y�l ise ekrana �Art�k y�l� degilse ekrana �Art�k y�l degil�
		yazd�r�n.*/
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir yil giriniz");
	int year=scan.nextInt();
	
	String result =year%100==0?year%400==0?"Artik yil1":"Artik yil degil1":year%4==0?"Artik yil2":"Artik yil degil2";
	System.out.println(result);
	scan.close();
}
}

