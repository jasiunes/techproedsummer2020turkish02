package day08nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
	
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
		
		if(s>0) {
			if(s>10) {
				System.out.println("Woooow");
			}else {
				System.out.println("Hýmmm");
			}
		}else if(s<=0) {
			if(s<-10) {
				System.out.println("Felaket");
			}else {
				System.out.println("Ne yapalým");}
		}
	scan.close();

		}}
