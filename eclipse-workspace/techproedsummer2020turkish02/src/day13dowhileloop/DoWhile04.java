package day13dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		/*Kullanicidan b ir string alin.
		Stringin icinde kücük 'a' varsa "Kazandiniz"
		'a' yoksa "Kaybettiniz yazin ve yeni string isteyin."*/

		Scanner scan = new Scanner(System.in);
		String ch ="a";
		
		do {
			if (!ch.contains("a")){
				System.out.println("Kaybettiniz.");
			}{
			System.out.println("Bir String giriniz");}
			ch = scan.nextLine();
				
			}while(!ch.contains("a"));
			System.out.println("Kazandiniz");
			scan.close();
		
		
		
		
	}

}
