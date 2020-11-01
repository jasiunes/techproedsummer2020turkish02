package day08nestedif;

import java.util.Scanner;

public class ArtikYilBayram {

	public static void main(String[] args) {
	/*	Kullanýcýdan bir yýl girmesini isteyin, yýl artýk yýl ise ekrana “Artýk yýl” degilse ekrana “Artýk yýl degil”
		yazdýrýn.*/
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir yil giriniz");
	int year=scan.nextInt();
	
	String result =year%100==0?year%400==0?"Artik yil1":"Artik yil degil1":year%4==0?"Artik yil2":"Artik yil degil2";
	System.out.println(result);
	scan.close();
}
}

