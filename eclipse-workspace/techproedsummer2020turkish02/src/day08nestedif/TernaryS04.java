package day08nestedif;

import java.util.Scanner;

public class TernaryS04 {

	public static void main(String[] args) {
		//  Kullan�c�dan bir dikd�rtgenin en ve boyunu girmesini isteyin. 
		// En ve boy e�it ise ekrana �Kare�
		// farkl� ise ekrana �Dikd�rtgen� yazd�r�n.
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikd�rtgenin en ve boy uzunluklarini giriniz");
		int en = scan.nextInt();
		int boy = scan.nextInt();
		String result = en!=boy ? "Dikd�rtgen": "Kare";
		System.out.println(result);
		scan.close();

	}

}
