package day33iterators;

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
//List1 icindeki her elemanin sonuna A harfini ekleyin
/*Loop kullanarak list'leri degistiremezsiniz,elemanlari degistirebilirsiniz ama list'i update edemezsiniz.*/
		
		System.out.println(list1); //[XA, YA, ZA]
//list1 icindeki her elemanin sonuna "A" harfini ekleyin
//Loop kullanarak list'leri degistiremezsiniz, elemanlari degistirebilirsiniz ama list'i update edemezsiniz.		
				for(String w : list1) {			
					w = w + "A";
				}
				System.out.println(list1);//[X, Y, Z]
	//Bir list'i update etmek isterseniz iterator kullanmak zorundasiniz.
				
				//1. Adim: ListIterator objesi olusturun
		ListIterator <String> li1 =list1.listIterator();
		//next(): ponter'i bir sonraki elemanin önüne tasir ve üstünden attigi elemani return eder.
		
		//2. Adim: while loop kullanin
		while (li1.hasNext()) {	
//Pointer >>> Isaretci >> Isaret eden her loopta hasNex
/*1)hasNext(): pointer'a "Senden sonra eleman var mi?" diye sorar. Pointer'dan sonra eleman varsa
 true, yoksa false cevabini alir. Cevap true ise loop  bir kez daha calisir, cevap false ise loop kirirlir.
2)next(): ponter'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
 3)set(): list icindeki elemanlari degistirmeye yarar.  */
			
			Object element = li1.next(); 
		     li1.set(element+"A");
			}
		System.out.println(list1);
	}

}
