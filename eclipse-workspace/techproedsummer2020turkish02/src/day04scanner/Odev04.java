package day04scanner;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
	
	 double d1=100.235;
	 int i1 =(int)d1;
	 System.out.println(d1);
	 System.out.println(i1);
	 
	 int i2 = 5;
	 double d2 =6.2;
	 System.out.println(i2+d2);
	 
	 		/*
	 		 Yarýçapý kullanýcýdan alýnan bir dairenin çevresini ve alanýný hesaplayan 
	          bir program yazýnýz. (float kullanýnýz)
	          Not 1: pi sayýsý: 3.14159
	          Not 2: Alan: 3.14159 x radius x radius
	          Not 3: Cevre: 2 x 3.14159 x radius
	 		*/
	 		
	 		Scanner scan = new Scanner(System.in);
	 		System.out.println("Yaricapi giriniz");
	 		float r = scan.nextFloat();
	 		
	 		System.out.println("Alan= " + 3.14159*r*r);
	 		System.out.println("Cevre= " + 2*3.14159*r);
	 		
	 		scan.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
