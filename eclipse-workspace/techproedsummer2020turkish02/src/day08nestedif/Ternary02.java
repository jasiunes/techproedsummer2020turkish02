package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
/*Kullan�c�dan bir ��genin  �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
�E�kenar ��gen� yazd�r�n. 
Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin �c kenar uzunlugunu giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		String result = k1==k2&& k1==k3 ? "ESKENAR UCGEN" : "ESKENAR UCGEN DEGIL";
		System.out.println(result);
scan.close();
	}

}
