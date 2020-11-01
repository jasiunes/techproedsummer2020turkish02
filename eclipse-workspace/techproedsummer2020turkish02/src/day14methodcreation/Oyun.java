package day14methodcreation;

import java.util.Scanner;

public class Oyun {

	public static void main(String[] args) {
	
		System.out.println("Gizemli rengi bul!");
		Scanner input = new Scanner(System.in);
		System.out.print("Aklina ilk gelen rengi yaz!"); 	
		String renk=input.nextLine();
		
		if(!renk.equals("Siyah")) {
			System.out.println("Bir renk daha giriniz!");
		
		do {
			 if (renk.equalsIgnoreCase("Kirmizi")) {
				System.out.println("Agresifsiniz.");
			
			} else if (renk.equalsIgnoreCase("Mavi")) {
			   System.out.println("Huzurlusunuz");
			
			} else if (renk.equalsIgnoreCase("Pembe")) {
				   System.out.println("Duygusalsiniz");
			
			}else if(renk.equalsIgnoreCase("Mor"));{
				System.out.println("Zenginlik Meraklisi!");
			
			}/*else if(renk.equalsIgnoreCase("Sari"));{
				System.out.println("Özgür ruhlusunuz!");
			
			}else if(renk.equalsIgnoreCase("Yesil"));{
					System.out.println("Umut dolusunuz!");
			
			
			}else if(renk.equalsIgnoreCase("Beyaz"));{
			System.out.println("Temiz ruh!");
			
			
			}else if(renk.equalsIgnoreCase("Beyaz"));{
				System.out.println("Temiz ruh!");
			}*/
			
		}while (!renk.equalsIgnoreCase("Siyah"));
				System.out.println("Gizemli!!!Kazandiniz");
		}}}

