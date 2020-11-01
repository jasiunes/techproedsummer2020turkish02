package day18arrays;

import java.util.Arrays;
import java.util.Scanner;
public class AyniEleman {

	public static void main(String[] args) {
		/* Kac elemanli array girilecegini sorun ve tum elemanlari isteyin,
		 * Tum elemanlari ekrana yazdirin ve son elemani ilk eleman yapin
		 */
		Scanner input =new Scanner(System.in);
		System.out.print("Array'iniz kac elemanli olacak ;");
		int d=input.nextInt();
		System.out.println(d+"Deger ;");
		int arr[]= new int[d]; //Array olusturduk
		
		for(int i=0; i<d ;i++) {
			System.out.print((i+1)+" . deger =");
			arr[i]=input.nextInt();
		}
		System.out.println("Array degerleriniz;"+ Arrays.toString(arr));
		
		int son =arr[d-1]; //Son deger
		for (int k=0; k<d-1;k++) {
			arr[d-k-1]=arr[d-k-2];
		}arr[0]=son;
		System.out.println("Yeni Array: "+Arrays.toString(arr));
		input.close();
	}

}
