package day08nestedif;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan bir y�l al�n 
		 E�er y�l 1000�e bulunuyorsa ekrana �Milenyum� yazd�r�n. 
        E�er y�l 100�e bulunuyorsa ekrana �Y�zy�l� yazd�r�n.
        E�er y�l 10�a bulunuyorsa ekrana �Ony�l� yazd�r�n.
		*/	
Scanner scan = new Scanner(System.in);
System.out.println("Bir yil giriniz");
int yil = scan.nextInt();

if(yil%1000==0) {
	System.out.println("Millenium");
}else if(yil%100==0) {
	System.out.println("Yuzyil");
}else if(yil%10==0) {
	System.out.println("Onyil");
}else {
	System.out.println("Hicbiri");
}

scan.close();

	}

}
