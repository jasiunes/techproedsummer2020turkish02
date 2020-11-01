package day13dowhileloop;

import java.util.Scanner;

public class DoWhileOdev05 {

	public static void main(String[] args) {
		/* Kullaniciya bir String girmesini söyleyin.
	String’in ilk harfi ile son harfi ayni ise
	 ekrana “Simetrik” yazdirin. 
	 Ayni deðilse tekrar bir String girmesini isteyin.*/
		Scanner scan = new Scanner (System.in);
		System.out.println("String giriniz.");
		
		String ch="a";
		do {
			if(ch.charAt(0)!=ch.charAt(ch.length()-1)) {System.out.println("Tekrar String giriniz!");}
			ch = scan.nextLine();
			} while (ch.charAt(0)!=ch.charAt(ch.length()-1));
				
		System.out.println("Simetrik");
				
		scan.close();
	}

}
