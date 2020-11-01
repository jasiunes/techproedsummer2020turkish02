package replit;

import java.util.Scanner;

public class M02SesliHarf {

	public static void main(String[] args) {
	
		//Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazýnýz.
		Scanner sc= new Scanner (System.in);
		System.out.println("Bir string giriniz:");
		String b="a,e,i,o,u";
		String s= sc.nextLine().toLowerCase();
		
		System.out.println(sesliHarf(s));
	}
	
	public static int sesliHarf(String s) {
		String a="a,e,i,o,u";
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = 0; j < a.length()-1; j++) {
				if (s.charAt(i)==a.charAt(j)) {
					count++;}
				}
				
			}
				return count;
		}
					
	
			

	}


