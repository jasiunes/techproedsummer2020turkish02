package day22foreachloop;

import java.util.Arrays;

public class FelProduct {

	public static void main(String[] args) {
		// Bir integer Array olusturun ve elemanlarini For-each loop kullanarak elelmanlarini carpiniz.
		int s[]= {1,3,5,7,9};
		System.out.println(Arrays.toString(s));//[1, 3, 5, 7, 9]
		int product = 1;
		for(int w : s) {
			product=product * w;
		}
		System.out.println("Carpim="+product);//945

	}

}
