package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("Ay ismini giriniz");
		String ay = scan.nextLine();
		
		// Kullanici ay ismini girince o ayin mevsimini ekrana yazdirin
       
       //Not: Switch'lerde boolean, float, double, long kullanilmaz.
       //     char, byte, short, int, String kullanilir

		switch(ay) {
		case  "Aralik":
		case  "Ocak":
		case "Subat":
			System.out.println("KIS");
			break;
		case "Mart":
		case "Nisan":
		case "Mayis":
			System.out.println("ILKBAHAR");	
			break;
		case "Haziran":
		case "Temmuz":
		case "Agustost":
			System.out.println("YAZ");
			break;
		case "Eylul":
		case "Ekim":
		case "Kasim":
			System.out.println("SONBAHAR");
			break;
		default:
			System.out.println("Gecersiz ay sayisi");	
	}
		scan.close();
	}

}
