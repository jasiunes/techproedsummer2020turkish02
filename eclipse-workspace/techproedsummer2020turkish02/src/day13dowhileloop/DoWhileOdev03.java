package day13dowhileloop;

import java.util.Scanner;

public class DoWhileOdev03 {

	public static void main(String[] args) {
		/* Kullaniciya sayi girmesini söyleyin.Kullanici sifir girdiginde,ekrana o ana 
		kadar girmis oldugu tüm sayilarin toplamini yazdirin.
		Ornegin;5,4,7,0 ise 5+4+7=16 oldugundan ekrana 16 yazdirin*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir sayi giriniz.");
		int s=0;
		int i=0;
		do { if (s!=0) {
			System.out.println("Bir sayi daha giriniz.");}
			s = scan.nextInt();
			i=i+s;}
			
		while(s!=0);
		System.out.println("Toplam:"+i);
		scan.close();
		
		
	}}