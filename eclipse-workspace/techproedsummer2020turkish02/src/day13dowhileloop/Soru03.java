package day13dowhileloop;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/* Kullan�c�dan uzunlu�u �ift say� olan bir String al�n ve bu String�in ilk yar�s�n� ekrana yazd�r�n.
		Ornegin; Kullan�c� �Hollanda� girerse ekrana �Holl� yazd�racaks�n�z.*/
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Cift sayili character'e sahip bir String giriniz");
	String s =scan.nextLine();
	
	System.out.println("Ilk yari:" + s.substring(0,s.length()/2));
    System.out.println("Son yari:"+ s.substring(s.length()/2));
    
    scan.close();
	
	
	}

}
