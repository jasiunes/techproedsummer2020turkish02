package day06ifstatementdt;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		/*Kullanicidan urun miktari ve birim fiyatini alin.
		Eger miktar 1000 den fazla ise %10 indirim yapin.
	Toplam parayi ekrana yazdirin. Diger durumda indirim
	yapmadan Toplam parayi ekrana yazdirin.*/

	Scanner scan = new Scanner(System.in);
	System.out.println("Alacaginiz �r�n miktarini giriniz.");
	double �r�nMiktari = scan.nextDouble();
	
	System.out.println("Alacaginiz birimfiyatini giriniz.");
	double birimFiyati = scan.nextDouble();
	
	
	if ((�r�nMiktari*birimFiyati)>1000)
	{System.out.println((�r�nMiktari*birimFiyati)-(�r�nMiktari*birimFiyati*0.10));
}
	else {
		System.out.println(�r�nMiktari*birimFiyati);
	}
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
