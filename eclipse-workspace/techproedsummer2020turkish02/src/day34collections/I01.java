package day34collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
	
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X, Y, Z]
		//List'i []
		ListIterator <String> li1 =list1.listIterator();
		while (li1.hasNext()) {	
			Object element = li1.next(); 
	     li1.set(element+"A");
	   
	}
		  System.out.println(list1);
	     //hasPrevious() ve previous() methodlarini kullanabilmek icin oncesinde hasNext()
		  //ve next()methodlarini pointer'i en saga tasimak icin kullanmak gerekir.
	     while(li1.hasPrevious()) {
	    Object element =li1.previous();
	    System.out.print(element+" ");
	     }
	}
}
