package day08nestedif;

import java.util.Scanner;

public class TernaryAtikYil06 {

	public static void main(String[] args) {
		 /* Kullanýcýdan bir yýl girmesini isteyin, yýl artýk yýl ise ekrana “Artýk yýl” degilse ekrana “Artýk yýl degil”
		yazdýrýn.
		 Genel bir kural olarak, artýk yýllar 4 rakamýnýn katý olan yýllardýr: 1980, 1984, 1988, 1992, 1996, 2000, 2004,
		  2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036 vb.
		 Ancak istisna durumu vardýr: 100'ün katý olan yýllardan sadece 400'e kalansýz olarak bölünebilenler artýk yýldýr.
		 Örneðin 1600 ve 2000 yýllarý artýk yýldýr ancak 1800 ve 1900 artýk yýl deðildir.  */

	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen bir yil giriniz");
	int yil = scan.nextInt();
	String result = yil%4==0&&yil%400==0&&yil%100!=0 ? "artik yil" : "artik yil degil";
	System.out.println(result);
	
	scan.close();


}}
