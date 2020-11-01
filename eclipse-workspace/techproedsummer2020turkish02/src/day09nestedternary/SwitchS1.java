package day09nestedternary;

import java.util.Scanner;

public class SwitchS1 {

	public static void main(String[] args) {
		// 

		Scanner scan = new Scanner(System.in);
		System.out.println("Gün adi giriniz");
		String day = scan.nextLine();
		
		switch (day) {
			case "Cuma" :
		System.out.println("Müslümanlar icin kutsal gun.");
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
