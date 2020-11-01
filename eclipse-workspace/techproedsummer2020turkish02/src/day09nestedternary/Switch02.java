package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		/*Kullanicidan gun numarasini alin
		 Ekrana gun ismini yazdirin*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gun numarasi giriniz");
		int tag= scan.nextInt();
		
		switch (tag) {
		case 1:
			System.out.println("Sontag");
			break;
		case 2:
			System.out.println("Montag");
			break;
		case 3:
			System.out.println("Dienstag");
			break;
		case 4:
			System.out.println("Mitwoch");
			break;
		case 5:
			System.out.println("Persembe");
			break;
		case 6:
			System.out.println("Fritag");
			break;
		case 8 :
			System.out.println("Samstag");
			break;
		default:
			System.out.println("Gecerli gun sayisi giriniz");
		}
		scan.close();
	}
	
}
