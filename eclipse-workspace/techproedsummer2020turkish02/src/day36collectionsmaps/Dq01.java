package day36collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Dq01 {

	public static void main(String[] args) {
/* 1)Deque Double Ended Queue demektir-
   2)Double Ended demek iki uclu demektir.
  Yani Deque ' de sona ekle bastan sil (FIFO) VE BASA EKLE SONDAN SIL:(LIFO.Last In First Out)
  kurallarinin ikisi de calisir.
   3) Deque ' ler resiabledir.
   4)  Deque ' ler LinkedList'lerden hiylidirlar.
   5) Deque ' ler eleman olarak "null" kabul etmezler.
 */
		Deque <String> dq01 = new LinkedList <>();
		dq01.add("Ali");
		dq01.add("Veli");
		dq01.addLast("Can");
		dq01.add("Ayse");
		dq01.addFirst("Emine");
		dq01.addLast("Reyhan");
		System.out.println(dq01);//[Emine, Veli, Ali, Can, Ayse, Reyhan]
		
		System.out.println(dq01.element());//Ilk elemani silmez silmeden size gösterir.
		System.out.println(dq01); //[Emine, Veli, Ali, Can, Ayse, Reyhan]
		
		
		System.out.println(dq01.peek());//Ilk elemani silmez silmeden size gösterir
		System.out.println(dq01);		//Ilk eleman yoksa "null" return eder.
		
		
		System.out.println(dq01.peekLast());//Reyhan
		System.out.println(dq01);//[Emine, Veli, Ali, Can, Ayse, Reyhan]
		
		System.out.println(dq01.poll());//[Veli, Ali, Can, Ayse, Reyhan]
		System.out.println(dq01);
		
		System.out.println(dq01.pollLast());//Reyhan siler...
		System.out.println(dq01);//[Veli, Ali, Can, Ayse]
		
	}

}
