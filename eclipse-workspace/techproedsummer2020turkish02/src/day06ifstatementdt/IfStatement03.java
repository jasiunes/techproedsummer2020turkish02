package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		
		
		
		if (sayi>0) { System.out.println("Pozitif");}
		
		if (sayi<0) { System.out.println("Negatif");}
	
		if (sayi==0) { System.out.println("Notr");}
		
		scan.close();
	
		
		
	}

}
