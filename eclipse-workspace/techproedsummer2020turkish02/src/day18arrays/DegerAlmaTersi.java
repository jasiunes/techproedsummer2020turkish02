package day18arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DegerAlmaTersi {

	public static void main(String[] args) {
	
		/* Kullanicidan kac elemanli array girilecegini ve tum elemanlarini isteyin
		 * Tum elemanlari ekrana yazdirin, belirli bir elemanin varligini kontrol edin
		 * Bu array in tum elemanlarini tersten yazdirin
		 */
		Scanner input =new Scanner(System.in);
		System.out.print("Array'iniz kac elemanli olacak ;");
		int n=input.nextInt();
		System.out.println(n+"Degerler ;");
		int arr[]= new int[n];
		
		for(int i=0; i<n;i++) {
			System.out.print((i+1)+". deger =");
			arr[i]=input.nextInt();
		}
		System.out.println("Array degerleriniz;"+ Arrays.toString(arr));
		
		// x degeri var mi?)
		System.out.print(" x degeri ;");
		int x=input.nextInt();
		int count=0;
		for(int k=0; k<n ;k++) {
			if (x==arr[k]) {
				count++;
			}
		}if (count == 1) {
				System.out.println("Deger var \n");
			}else {
				System.out.println("Bu deger yok! \n");
		}
		
		
		// Degerlerin tersi
		System.out.print("Ters array ;");
		for(int t=0; t<n/2; t++) {
			int index = arr[t];
			arr[t] = arr[arr.length-t-1];
			arr[arr.length-t-1]=index;
		}System.out.println(Arrays.toString(arr));		
		input.close();
	}}
