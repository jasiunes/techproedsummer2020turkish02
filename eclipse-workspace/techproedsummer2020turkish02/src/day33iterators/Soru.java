package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Soru {

	public static void main(String[] args) {
		/*
		 String bir list olusturun
		 Her elemanin basina "K", sonuna "L" ekleyin.
		 Yeni list'i ekrana yazdirin 
		*/

		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("O");
		list2.add("U");
		System.out.println(list2); //[A, O, U]
		ListIterator <String> li2 =list2.listIterator();
		while (li2.hasNext()) {	Object element = li2.next(); 
	     li2.set("K"+element+"L");
		}
	System.out.println(list2);//[KAL, KOL, KUL]
}
	}


