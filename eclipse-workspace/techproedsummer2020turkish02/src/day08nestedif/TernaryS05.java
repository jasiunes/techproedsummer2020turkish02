package day08nestedif;

import java.util.Scanner;

public class TernaryS05 {

	public static void main(String[] args) {
		 /*
		 Kullan�c�dan bir tamsay� girmesini isteyin, o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
		3 basamakl� degilse �ift olup olmadigini kontrol edin. �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
		�ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.
		 */
		
		 Scanner scan=new Scanner (System.in);
			System.out.println("lutfen uc basamakl� b�r say� g�r�n�z");
			int sayi=scan.nextInt();
			
			String result = sayi>=100 && sayi<=999 ? "3 basamakl�" : sayi%2==0 ? "3 basamakl� olmayan cift sayi" :
																    		   "3 basamakl� olmayan tek sayi";
			System.out.println(result);	
			scan.close();

		
	
	
	}

}
