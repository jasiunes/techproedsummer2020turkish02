package day14methodcreation;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan isim ve soyismini alin. Kullanicidan isim ve soyisminin
		  ilk harflerini büyükdiger harflerini kücük harf olarak ekrana 
		  yazdiran kodu yaziniz.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Schreiben Sie Ihren Namen");
		String name = scan.nextLine();
		System.out.println("Schreiben Sie Ihren Nachnamen:");
		String nachName = scan.nextLine();
		
		nameNachName(name,nachName);
		scan.close();
	}
	public static  void nameNachName(String name,String nachName) {
		System.out.print(name.toUpperCase().charAt(0)+name.toLowerCase().substring(1));
		System.out.println(" "+nachName.toUpperCase().charAt(0)+nachName.toLowerCase().substring(1));
		
		}
	
	
	
}