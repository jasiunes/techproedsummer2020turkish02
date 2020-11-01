package day12forvewhileloop;

import java.util.Scanner;

public class OdevWhileLoop03 {

	public static void main(String[] args) {
		/*Kullanicidan baslangic ve bitis degerlerini aliniz.
		baslangictan bitise kadar olan cift sayma sayilarini ekrana yazdirin.*/

		
		Scanner scan = new Scanner (System.in);
		System.out.println("Baslangic degeri giriniz.");
		int baslangic = scan.nextInt();
		System.out.println("Bitis degeri giriniz.");
		int bitis  = scan.nextInt();
			
		int sayma = 1;
		int i=baslangic;
		while ( i<=bitis) 
		{if(i%2==0) {
			System.out.println(i+"");
				sayma++;
			}
		i++;
	}
    scan.close();

}

}