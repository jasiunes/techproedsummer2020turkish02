package day22foreachloop;

import java.util.Arrays;
import java.util.List;

public class FelString {

	public static void main(String[] args) {
		//Bir String olusturunuz,bu String'deki character'leri for-each loop kullanarak yazdiriniz.
		String str="AYDINLANMA";
		String arr3[]=str.split("");
		System.out.println(Arrays.toString(arr3));
		List<String> sl3=Arrays.asList(arr3);
		System.out.println(sl3);
		for(String w:sl3) {
			System.out.println(w);
		}}}