package day12forvewhileloop;

import java.util.Scanner;

public class OdevWhileLoop11 {

	public static void main(String[] args) {
		// Kullanýcýdan bir sayý alýn ve bu sayýnýn bölenlerini ekrana yazdýrýnýz.Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
				Scanner scan = new Scanner (System.in);
				System.out.println("Lutfen bir sayi giriniz giriniz");
				int num=scan.nextInt();
				
				for(int i =1; i<=num;i++) {
					if(num%i==0) {
						System.out.print(i+" ");
					}
				}
				
				
				int deger=1;
				while(deger<=num) {
					if (num%deger==0) {
						System.out.print(deger+" ");	}
					deger++;		}
				scan.close();}
}
