package day10stringmethods;

import java.util.Scanner;

public class OdevStringCard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen 16 haneli kart numaranizi giriniz");
	    
	    String card = scan.nextLine();
		System.out.println(card.charAt(2));
		System.out.println(card.charAt(3));
		System.out.println(card.charAt(15));
		scan.close();
	}

}
