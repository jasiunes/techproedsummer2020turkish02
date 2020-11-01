package day10stringmethods;

import java.util.Scanner;

public class OdevString02 {

	public static void main(String[] args) {
			
		//Ad ve soyadin ilk harflerini ekrana buyuk harfle yazdirin

		Scanner scan = new Scanner (System.in);
		System.out.println("Adinizi yaziniz ve soyadinizi yaziniz."); 
		String ad = scan.nextLine();
		System.out.println("Soyadinizi yaziniz.");
		String soyAd =scan.nextLine();
		System.out.println(ad.toUpperCase().charAt(0));
		System.out.println(soyAd.toUpperCase().charAt(0));
		scan.close();
	}

}
