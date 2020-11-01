package day19arrays;

import java.util.Arrays;

public class Array02Binary {

	public static void main(String[] args) {
		int arr[] = {2,1,7,6};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 2));//1==>Index
		System.out.println(Arrays.binarySearch(arr, 7));//3
		System.out.println(Arrays.binarySearch(arr, 3));//-3==>sirasi
		System.out.println(Arrays.binarySearch(arr, 9));//-5
		System.out.println();
		
		String str[]= {"A","B","C","D"};
	    Arrays.sort(str);
	    System.out.println(Arrays.binarySearch(str,"A"));//0
	    System.out.println(Arrays.binarySearch(str,"C"));//2
	    System.out.println(Arrays.binarySearch(str,"G"));//-5
	    System.out.println(Arrays.binarySearch(str,"E"));//-5
	}
	

}
