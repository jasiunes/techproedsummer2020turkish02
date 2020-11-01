package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		
		List<String> sl= new ArrayList<>();
		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayse");
		System.out.println(sl); //[Ali, Kemal, Ayse]
		
		//Bir elemani degistirme nasil yapilir?
		sl.set(0, "Aliye");
		System.out.println(sl); //[Aliye, Kemal, Ayse]
		
		//Bir elemani degistirme nasil yapilir?
		System.out.println(	sl.contains("Kemal"));//true
		System.out.println(sl.contains("XXXX"));//false
		
		//Elemanlari natural order'a (Kucukten buyuge+Alfabetik sira) göre nasil dizeriz.
		Collections.sort(sl);//Cok kullanilir
		System.out.println(sl);//[Aliye, Ayse, Kemal]

		//Elemanlari natural order'in tersine gore siralama nasil yapilir?
		Collections.reverse(sl);
		System.out.println(sl);//[Kemal, Ayse, Aliye]
		
		//Bir List'deki elemanlarin tamamini silmek.
		sl.clear();
		System.out.println(sl); //[]
		//Iki listin esit olup olmadigini nasil kontrol ederiz.
		
		//Note:Listler asla Primitive'lerle calismazlar.
		/*
		 * Her primitive data type'inin bir WRAPPER CLASS#i vardir.
		 Primitive   WrapperClass(Non-Primitive)
		  boolean	==>Boolean
		  char		==> Character
		  short		==>Byte
		  int		==>Integar
		  float     ==>Float
		  long      ==>Long
		  double    ==>Double
		 */
		List<Integer> il1 = new ArrayList<>();
		il1.add(12);
		il1.add(14);
		il1.add(13);
		
		List<Integer> il2 = new ArrayList<>();
		il2.add(12);
		il2.add(13);
		il2.add(14);
		System.out.println(il1.equals(il2));//Esitse true degilse false
		
		//Hem elemanlari hem de elemanlarin index#lerini kontrol eder hepsi ayniysa true
		
	}

}
