package day10stringmethods;

import java.util.Scanner;

public class OdevStringMethodUlke03 {

	public static void main(String[] args) {
		/*Kullanicidan yasadigi ülkenin ismini alin Amerika ise USA
		Ingiltere ise UK,Almanya ise DE
		Diger ulkeler icin ise NA yazdirin.*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasadiginiz ulkeyi yaziniz.");
		String u = scan.nextLine();
		
		switch (u) {
		case "Amerika":
		System.out.println(u.replace("Amerika", "USA"));
		break;
		case"Ingiltere":
		System.out.println(u.replace("Ingiltere", "UK"));
		break;
		case "Almanya":
		System.out.println(u.replace("Almanya", "DE"));
		break;
		default:
		System.out.println("NA");
		}
     scan.close();
	}

}
