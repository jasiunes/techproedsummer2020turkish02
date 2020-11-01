package replit;

import java.util.Scanner;

public class Strng3 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		     System.out.println("Bir cümle yaziniz.");
		    String u = input.nextLine();
		    
		   
		      if (u.contains("is")){
		        System.out.println("True");
		        }else if(u.contains("and")){
		          	System.out.println("False");
		          //	System.out.println(input.contains("False"));
		          
		        }

	}

}
