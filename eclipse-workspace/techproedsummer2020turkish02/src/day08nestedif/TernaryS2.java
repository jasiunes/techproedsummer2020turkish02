package day08nestedif;

import java.util.Scanner;

public class TernaryS2 {

	public static void main(String[] args) {
		// //Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er iki kenar uzunlu�u birbirine e�it ise ekrana
		//�Ikizkenar Ucgen� yazd�r�n. Di�er durumlarda ekrana �Ikizkenar de�il� yazd�r�n.
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin A-B-C kenar uzunluklarini giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		String result = (a==b) && (a!=c)|| (b==c) && (b!=a) || (a==c)&&(a!=b) ? "Ikiz Kenar �cgen" : "Ikiz Kenar �cgen degil";
		System.out.println(result);
		scan.close();
		
		
	}

}
