package day09nestedternary;

import java.util.Scanner;

public class SwitchS1 {

	public static void main(String[] args) {
		// 

		Scanner scan = new Scanner(System.in);
		System.out.println("G�n adi giriniz");
		String day = scan.nextLine();
		
		switch (day) {
			case "Cuma" :
		System.out.println("M�sl�manlar icin kutsal gun.");
			break;
		case "Cumartesi" :
			System.out.println("Yahudiler icin kutsal gun.");
			break;
		case "Pazar" :
			System.out.println("Hiristiyanlar icin kutsal gun.");
			break;
			
		default:
				System.out.println("Kutsal gun degil!");
		}
	
	scan.close();
	
	}
	

}
