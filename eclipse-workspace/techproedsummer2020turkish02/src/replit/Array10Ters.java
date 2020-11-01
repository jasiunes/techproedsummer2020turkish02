package replit;

import java.util.Scanner;

public class Array10Ters {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Bir cümle yaziniz");
		    String sentence = input.nextLine();
		    
		    String reversed = "";
		       String[] arr=sentence.split(" ");
		   
		       for (int i = arr.length-1;i>=0 ; i--) {
				        reversed=reversed+arr[i]+" ";
		       }
		  
		    System.out.println(reversed);


	}

}
