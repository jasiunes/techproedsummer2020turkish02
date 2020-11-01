package day10stringmethods;

import java.util.Scanner;

public class String05Ulke {

	public static void main(String[] args) {
		// // Kullanicidan yadigi ulkenin ismini alin bu ulkenin bastan ikinci ve sondan ikinci harfini buyuk olarak yazdirin.
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasadiginiz ulkeyi yaziniz.");
		String u = scan.nextLine();
		System.out.println(u.charAt(1)); 
		
		scan.close();

	}

}
