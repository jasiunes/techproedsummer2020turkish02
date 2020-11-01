package day19arrays;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		int arr1[] = {2,1,7,6};
		int arr2[] = {2,1,7,6};
		System.out.println(Arrays.equals(arr1,arr2)); //true
		System.out.println(arr1.equals(arr2));
		/*int arr3[] = {3,2,8,7,11};
		int arr4[] = {7,8,3,11,2};
		System.out.println(Arrays.equals(arr3,arr4)); //false
		
		int arr5[] = {4,5,9,8,10};
		int arr6[] = {8,9,4,10,5};
		System.out.println(Arrays.equals(arr5,arr6)); //false*/
		
	}

}
