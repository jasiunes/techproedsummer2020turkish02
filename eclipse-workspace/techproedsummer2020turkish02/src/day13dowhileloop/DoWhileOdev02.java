package day13dowhileloop;

import java.util.Scanner;

public class DoWhileOdev02 {

	public static void main(String[] args) {
		//Kullanicidan baslangic ve bitis degerleri alin.
		//4 ve 6 ile bolunenleri ekrana yazdirin.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Baslangic degeri giriniz.");
		int baslangic = scan.nextInt();
		System.out.println("Bitis degeri giriniz.");
		int bitis  = scan.nextInt();
		int i=baslangic;
		do {
			if (i%4==0 && i%6==0)
			System.out.println(i+" ");
			i++;
			}
		while (i<bitis);
		
		scan.close();
	}

}
