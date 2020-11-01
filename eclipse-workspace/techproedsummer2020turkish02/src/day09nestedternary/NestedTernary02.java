package day09nestedternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		/*Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		 Ucu birbirine esitse ucgenin cevresini kontrol edin
		 Cevre 30 dan buyuk ise "Ne buyuksun!" yazdirin degilse "Normal" yazdirin
		 Ucu birbirine esit degilse ucgenin cevresini kontrol edin
		 Cevre 20 den kucuk ise "Ne kucuksun!" yazdirin degilse "Normal" yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin A-B-C kenar uzunluklarini giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		String result = (a==b && a==c) ? (a+b+c>30)? "Ne büyüksün" : "Normal" :
						( a+b+c<20)? "Ne kücüksün" : "Normal";
		System.out.println(result);
	    scan.close();

}}
