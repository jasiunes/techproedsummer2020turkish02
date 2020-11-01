package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FelSayininKaresi {

	public static void main(String[] args) {
		//// Bir integer ArrayList olusturun ve elemanlarinin kareleri toplamini For-each loop kullanarak bulunuz..
		List<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(4);
		lst.add(6);
		lst.add(8);
		lst.add(10);
		System.out.println(lst);//[2, 4, 6, 8, 10]
		
		int sum =0;
		for(int w : lst) {
			sum=sum+(w * w);
		}
		System.out.println(sum);//220


	}

}
