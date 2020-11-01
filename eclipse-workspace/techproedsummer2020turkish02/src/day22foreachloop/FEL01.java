package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {
		//
		List<Integer> il = new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		//for each loop=enhanced loop daha güzel hale getirirlmis
		for(Integer w : il) {
			System.out.print(w+" ");	
		}
		// il list'in tüm elemanlarini toplayiniz.
		int sum = 0;
		for(Integer w : il) {
			sum=sum + w;
		}
		System.out.println("Toplam"+sum);//66
		
		//il listinin icindeki tek sayi olan elemanlarin carpimini bulunuz.
		int product = 1;
		for(int w : il) {
			if (w%2!=0)
			product=product * w;
		}
		System.out.println(product);//483

		//il listinin icindeki tek sayi olan elemanlarin 
		
		for(int w : il) {
			if (w%2!=0) {
			System.out.println(w);
		}}
		//Break ve continue karsilastirma
		//Ilk üc elemani yazdiriniz.
		int count = 0;
		for(Integer w : il) {
				if (count<3) {
			System.out.print(w+" ");	
			count++;
		}}
		System.out.println();
		
		int count1 = 0;
		for(int w : il) {
			System.out.println(w+" ");
			count1++;
			if (count1==3) {
			break;	}}
		System.out.println();
	
		//il listinde 3 ile bölünebilenleri ekrana yazdiriniz.
		//1.Yol:
		for(int w : il) {
			if (w%3==0)
			System.out.print(w+" ");}
		System.out.println();
		
	for(int w : il) {
	if (w%3!=0) {
		continue;
	}
	System.out.print(w+" ");
		
	}}}
	