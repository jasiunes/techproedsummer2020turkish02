package day09nestedternary;

import java.util.Scanner;

public class SwitchS4 {

	public static void main(String[] args) {
	 /*
		Kullan�c�dan ay ismi al�n e�er ay ismi 31 �eken aylardan biri ise ekrana �Bu ay 31 g�nd�r� yazd�r�n.
		E�er ay ismi 30 �eken aylardan biri ise ekrana �Bu ay 30 g�nd�r� yazd�r�n.
		E�er ay ismi 28 veya 29 �eken aylardan biri ise ekrana �Bu ay �ubat ay�d�r� yazd�r�n.
		Bu isimlerin d���ndaki isimler i�in �Ge�ersiz ay ismi� yazd�r�n.
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
