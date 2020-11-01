package day34collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X, Y, Z]

		//List'i [ZA, YA, XA] sekline iterator kullanarak donusturun
		ListIterator <String> li1 = list1.listIterator();
		while(li1.hasNext()) {
			Object element =  li1.next();
		}
		ListIterator <String> li2 = list1.listIterator();
		while(li2.hasPrevious()) {
			Object el = li1.hasPrevious();
			li1.set(el+"A");
		}
		Collections.reverse(list1);
		System.out.println(list1);
	}

}
