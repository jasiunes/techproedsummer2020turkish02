package day11stringmethodsforloopdt;

public class forLoop100 {

	public static void main(String[] args) {
		//Ekrana ilk 100 pozitif cift sayma sayisini yazdririniz
		//Her 10 sayida 5 adet cift sayi vardir.200 e kadar 100 adet vardir
		
		for(int i=1;i<=200;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				}
		}
		System.out.println("***************");
	// 2.Yol
		int sayma=1;
		for (int i = 1; sayma<=100; i++) {
		if(i%2==0) {
			System.out.print(i + " ");
			sayma++;}
		
		}
		
		}
	}


