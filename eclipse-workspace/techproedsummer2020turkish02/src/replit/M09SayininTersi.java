package replit;

import java.util.Scanner;

public class M09SayininTersi {

	public static void main(String[] args) {
//		�ki basamakl� say�n�n tersinin kendisinden b�y�kl�k durumunu kontrol eden Methodu yaz�n�z. 
//		Say�n�n kendisi tersinden b�y�k ise TRUE k���k ise FALSE return etmeli.
		
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
