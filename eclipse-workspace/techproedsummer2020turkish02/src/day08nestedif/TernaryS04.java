package day08nestedif;

import java.util.Scanner;

public class TernaryS04 {

	public static void main(String[] args) {
		//  Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
		// En ve boy eþit ise ekrana “Kare”
		// farklý ise ekrana “Dikdörtgen” yazdýrýn.
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdörtgenin en ve boy uzunluklarini giriniz");
		int en = scan.nextInt();
		int boy = scan.nextInt();
		String result = en!=boy ? "Dikdörtgen": "Kare";
		System.out.println(result);
		scan.close();

	}

}
