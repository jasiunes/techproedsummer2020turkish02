package day08nestedif;

import java.util.Scanner;

public class TernaryS03 {

	public static void main(String[] args) {
		// //Kullanýcýdan bir tamsayý girmesini isteyin, ekrana o tamsayýnýn mutlak degerini yazdýrýn.


		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz");
		int num1 = scan.nextInt();
		
		int result = (num1>0) ?  num1 :num1 *(-1);
		System.out.println(result);
		
		scan.close();
	}

}
