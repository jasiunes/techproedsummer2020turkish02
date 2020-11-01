package day08nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		/*Kullanicidan bir harf girmesini isteyin. Eger 
		kucuk harf 'a' ise ekrana "Ilk kucuk harf" degilse "Ilk
		kucuk harf degil" yazdirin. Buyuk harf 'Z' ise "Son buyuk
		harf " yazdirin, degilse "Son buyuk harf degil" yazdirin.*/

 Scanner scan = new Scanner(System.in);
 System.out.println("Bir harf giriniz");
char harf = scan.next().charAt(0);

	if(harf>='a'&& harf<='z') {	 
		if(harf=='a') {
		System.out.println("Ilk kücük harf");
		} else  { System.out.println("Ilk kücük harf degil");}
	
	}else {
		if(harf=='Z'&& harf>='A') {
			System.out.println("Son buyuk harf");
		}else {
			System.out.println("Son buyuk harf degil");
		}
	}
	scan.close();
	}
	}
