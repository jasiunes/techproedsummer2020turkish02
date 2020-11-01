package replit;

import java.util.Scanner;

public class replit31 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Bir String giriniz.");
		   String s= input.nextLine();
		  
		   
		    System.out.print(s.substring(0, s.length()-1));
		    System.out.print(s.toUpperCase());
	}

}
