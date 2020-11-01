package day19arrays;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
	int arr[]= {2,1,7,6};
	Arrays.sort(arr);
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");//1 2 6 7 
		
	}
	System.out.println();
	String str[]= {"Ali","Ahmet","Kemal","Can"};
    Arrays.sort(str);
    for(int i =0; i<str.length; i++) {
    	System.out.print(str[i] + " ");//Ahmet Ali Can Kemal 
    }

}}