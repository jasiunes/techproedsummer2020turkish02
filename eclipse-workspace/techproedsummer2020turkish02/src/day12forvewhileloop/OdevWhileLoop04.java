package day12forvewhileloop;

import java.util.Scanner;

public class OdevWhileLoop04 {

	public static void main(String[] args) {
		 /*Kullanicidan baslangic ve bitis degerlerini aliniz.
		baslangictan bitise kadar olan tum sayilarin toplamini ekrana yazdirin.*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Baslangic degeri giriniz.");
		int baslangic = scan.nextInt();
		System.out.println("Bitis degeri giriniz.");
		int bitis  = scan.nextInt();
		
		int sum = 0;
		int s = baslangic;
		while (s<=bitis) {
			sum=sum+s;
			s++;
		}
		System.out.println(sum);	
		scan.close();
	}

	}


