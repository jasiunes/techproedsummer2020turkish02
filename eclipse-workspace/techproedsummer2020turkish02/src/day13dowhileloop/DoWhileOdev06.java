package day13dowhileloop;

import java.util.Scanner;

public class DoWhileOdev06 {

	public static void main(String[] args) {
		/* Kullan�c�dan bir String al�n  String�in  icinde;
	 �a� harfi varsa ekrana �a harfi var� yazd�r�n.
	 �a� harfi yoksa tekrar bir String girmesini isteyin.*/
		Scanner scan = new Scanner (System.in);
		System.out.println("String giriniz.");
		
		String aa="a";
		
		do
		{
			if(!aa.contains("a")) {System.out.println("Tekrar String giriniz!");}
			aa = scan.nextLine();
		} while (!aa.contains("a"));
		
		System.out.println("String'de 'a' harfi var.");
		scan.close();
		
	}

}
