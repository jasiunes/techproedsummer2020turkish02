package day09nestedternary;

import java.util.Scanner;

public class SwitchS4 {

	public static void main(String[] args) {
	 /*
		Kullanýcýdan ay ismi alýn eðer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdýrýn.
		Eðer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdýrýn.
		Eðer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Þubat ayýdýr” yazdýrýn.
		Bu isimlerin dýþýndaki isimler için “Geçersiz ay ismi” yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Ay ismini giriniz");
		String ay = scan.nextLine();
		
		switch(ay) {
		case  "Aralik":
		case  "Ocak":
		case "Mart":
		case "Mayis":
		case "Temmuz":
		case "Agustos":
		case "Ekim":
			System.out.println("Bu ay 31 gundur.");
			break;
		case "Nisan":
		case "Haziran":
		case "Eylul":
		case "Kasim":
			System.out.println("Bu ay 30 gundur.");	
			break;
		case "Subat":
			System.out.println("Bu ay 28-29 gundur.");
			break;
		default:
			System.out.println("Gecersiz ay ismi!");
		}
		scan.close();
	}

}
