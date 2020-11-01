package day08nestedif;

import java.util.Scanner;

public class TernaryAtikYil06 {

	public static void main(String[] args) {
		 /* Kullan�c�dan bir y�l girmesini isteyin, y�l art�k y�l ise ekrana �Art�k y�l� degilse ekrana �Art�k y�l degil�
		yazd�r�n.
		 Genel bir kural olarak, art�k y�llar 4 rakam�n�n kat� olan y�llard�r: 1980, 1984, 1988, 1992, 1996, 2000, 2004,
		  2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036 vb.
		 Ancak istisna durumu vard�r: 100'�n kat� olan y�llardan sadece 400'e kalans�z olarak b�l�nebilenler art�k y�ld�r.
		 �rne�in 1600 ve 2000 y�llar� art�k y�ld�r ancak 1800 ve 1900 art�k y�l de�ildir.  */

	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen bir yil giriniz");
	int yil = scan.nextInt();
	String result = yil%4==0&&yil%400==0&&yil%100!=0 ? "artik yil" : "artik yil degil";
	System.out.println(result);
	
	scan.close();


}}
