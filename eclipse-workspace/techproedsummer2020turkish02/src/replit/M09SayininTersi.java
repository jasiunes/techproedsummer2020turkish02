package replit;

import java.util.Scanner;

public class M09SayininTersi {

	public static void main(String[] args) {
//		İki basamaklı sayının tersinin kendisinden büyüklük durumunu kontrol eden Methodu yazınız. 
//		Sayının kendisi tersinden büyük ise TRUE küçük ise FALSE return etmeli.
		
		Scanner input= new Scanner (System.in);
		System.out.println("Enter a two digit number please:");
		int num= input.nextInt();
		input.close();
		System.out.println(sayininTersi(num));
	}
	
	public static boolean sayininTersi(int num) {
		int sonuc=0;
		int a= num%10;
		int b= num/10;
		sonuc= b*10+a;
		if (sonuc>num) {
			return true;
		}
		else {
			return false;}

	}

}
