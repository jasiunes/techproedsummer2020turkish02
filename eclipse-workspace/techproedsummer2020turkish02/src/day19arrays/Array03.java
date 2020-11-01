package day19arrays;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		int [] x = {0,1,2,3};
		int temp;
		int i =0;
		int j = x.length-1;
		while (i<j) {
			temp = x[i];
			x[i]=x[j];
			x[j]= 2*temp;
			i++;
			j--;
			System.out.println(Arrays.toString(x));//3,2,2,0
		}
		System.out.println(Arrays.toString(x));//3,2,2,0
	}

}
