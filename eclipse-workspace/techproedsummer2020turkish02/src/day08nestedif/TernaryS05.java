package day08nestedif;

import java.util.Scanner;

public class TernaryS05 {

	public static void main(String[] args) {
		 /*
		 Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
		3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
		Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.
		 */
		
		 Scanner scan=new Scanner (System.in);
			System.out.println("lutfen uc basamaklı bır sayı gırınız");
			int sayi=scan.nextInt();
			
			String result = sayi>=100 && sayi<=999 ? "3 basamaklı" : sayi%2==0 ? "3 basamaklı olmayan cift sayi" :
																    		   "3 basamaklı olmayan tek sayi";
			System.out.println(result);	
			scan.close();

		
	
	
	}

}
