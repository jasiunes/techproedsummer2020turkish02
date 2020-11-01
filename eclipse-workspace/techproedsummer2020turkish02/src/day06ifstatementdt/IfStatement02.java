package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gun giriniz");
		String gun = scan.nextLine();
		
		if( gun.equals("cuma") ){
			System.out.println("Müslümanlar icin kutsal gun");
			
		}
		if (gun.equals("cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
			
		}
		
		if (gun.equals("pazar")) {
			System.out.println("Hiristiyanlar icin kutsal gun");
	
		}
		scan.close();
	}

}
