package day10stringmethods;

import java.util.Scanner;

public class StringMethodsOdev01 {

	public static void main(String[] args) {
		// Kullanicidan ad soyadini alin kac harften olustugunu ekrana yazin
		Scanner scan = new Scanner (System.in);
		System.out.println("Adinizi yaziniz ve soyadinizi yaziniz."); 
		String ad = scan.nextLine();
		System.out.println(ad.length());
		scan.close();
	}

}
