package day09nestedternary;

import java.util.Scanner;

public class SwitchS3 {

	public static void main(String[] args) {
	 /*	Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
		�b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.
		Bu harflerin d���nda bir character i�in �Ge�ersiz character� yazd�r�n.
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
