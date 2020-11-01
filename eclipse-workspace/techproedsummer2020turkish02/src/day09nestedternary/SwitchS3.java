package day09nestedternary;

import java.util.Scanner;

public class SwitchS3 {

	public static void main(String[] args) {
	 /*	Kullanýcýdan bir harf alýn eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
		“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn.
		Bu harflerin dýþýnda bir character için “Geçersiz character” yazdýrýn.
	 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int s = scan.nextInt();
		
		switch (s) {
		case 9 : System.out.println("Bir basamakli en buyuk sayi.");
			break;
		case 99 : System.out.println("Iki basamakli en buyuk sayi.");
		break;
		case 999 : System.out.println("Uc basamakli en buyuk sayi.");
		break;
		default:
			System.out.println("Yorum yok!");
		}
		scan.close();

	}

}
