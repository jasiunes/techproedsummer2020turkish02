package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListQ {

	public static void main(String[] args) {
	// 1)Elemanlari A,C,E,F olan bir String ArrayList olusturunuz.
		List<String> sl= new ArrayList<>();//[A, C, E, F]
		sl.add(0,"A");
		sl.add(1,"C");
		sl.add(2,"E");
		sl.add(3,"F");
		System.out.println(sl);
	//2)Indexsiz add() methodunu kullanarakB'yi ekleyiniz.
		//Index ile L yi 1 nolu indexe ata cikti
		sl.add("B");
        System.out.println(sl);//Her zaman sona ekler.[A, C, E, F, B]
        sl.add(1,"L");
        System.out.println(sl);//[A, L, C, E, F, B]
    //3) set() methodu kullanarak E yi D yapiniz. 
        sl.set(3,"D");
        System.out.println(sl);//[A, L, C, D, F, B]
   // 4) remove() ile Fyi siliniz.
        sl.remove("F");
        System.out.println(sl); //[A, L, C, D, B]
  //5) sort() ile elemanlari siralayiniz.
        Collections.sort(sl);
        System.out.println(sl); //[A, B, C, D, L]
  //6) contains() ile L'nin listede var olup  M in olmadigini yazdir.  
        System.out.println(sl.contains("L"));//True
        System.out.println(  sl.contains("M"));//False
   //7) size() kullanarak listin kac elemanli oldugunu yazdir.
        System.out.println(sl.size()); //5
   //8) clear() ile List'deki tüm elemanlari siliniz.
        sl.clear();
        System.out.println(sl); //[]
   // 9)isEmpty() ile tüm elemanlarin silindigini dogrulayiniz.
        System.out.println(sl.isEmpty());//true
        
        
	}

}
