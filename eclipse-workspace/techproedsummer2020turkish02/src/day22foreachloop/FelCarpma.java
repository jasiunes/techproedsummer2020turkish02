package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FelCarpma {

	public static void main(String[] args) {
		// Bir integer ArrayList olusturun ve elemanlarini For-each loop kullanarak elelmanlarini carpiniz.
		List<Integer> fil = new ArrayList<>();
		fil.add(12);
		fil.add(13);
		fil.add(14);
		fil.add(15);
		fil.add(16);
		fil.add(17);
		System.out.println(fil);//[12, 13, 14, 15, 16, 17]
		int product = 1;
		for(int w : fil) {
			if (w%2!=0)
			product=product * w;
		}
		System.out.println(product);//3315

		
		
	}

}
