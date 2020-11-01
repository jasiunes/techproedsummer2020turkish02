package day10stringmethods;

import java.util.Scanner;

public class StringUlke04 {

	public static void main(String[] args) {
		// Kullanicidan yadigi ulkenin ismini alin bu ulkenin ilk iki harfini buyuk olarak yazdirin.
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasadiginiz ulkeyi yaziniz.");
		String u = scan.nextLine();
		System.out.print(u.toUpperCase().charAt(0));
		System.out.println(u.toUpperCase().charAt(1));
		scan.close();
	}

}
