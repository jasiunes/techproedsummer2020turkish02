package day08nestedif;

import java.util.Scanner;

public class TernaryS01 {

	public static void main(String[] args) {
		/* Kullan�c�dan bir tamsay� girmesini isteyin, tamsay� �ift ise ekrana
		  ��ift� tek ise ekrana �Tek� yazd�r�n.*/

Scanner scan = new Scanner (System.in);
int s = scan.nextInt();
String result = (s%2==0) ? "Cift sayi" : "Tek sayi";
System.out.println(result);
scan.close();
	}

}
