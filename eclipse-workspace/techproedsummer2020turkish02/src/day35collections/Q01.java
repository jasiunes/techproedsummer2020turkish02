package day35collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q01 {

	public static void main(String[] args) {
		//Ilk eklenen ilk silinir.==>FIFO : First In First Out
	Queue <String> q01 =new LinkedList<>();
	q01.add("Apple");
	q01.add("Mango");
	q01.add("Fig");
	q01.add("Grape");
	q01.add("Peach");
		System.out.println(q01);//[Apple, Mango, Fig, Grape, Peach]
		
		q01.remove();
		System.out.println(q01);//[Mango, Fig, Grape, Peach]
		
		q01.element();//Size ilk elemani verir,ama ilk elemani Queue'den silmez.
		System.out.println(q01);//[Mango, Fig, Grape, Peach]
		
		q01.peek();//Ilk elemani size verir ama ilk elemani Queue'den silmez..
		//Ilk eleman yoksa "null" return eder.

		System.out.println(q01.poll());//MangoIlk elemani size verir ama ilk elemani Queue'den siler.
		System.out.println(q01);//[Fig, Grape, Peach]
		
	     //PriorityQueue<>() kullanirsaniz bazen natural order'a göre elemanlari dizer.
		//bazen de Java arkada kendine göre bir kural olusturur ve ona göre elemanlari dizer.
		Queue<String>q02 = new PriorityQueue<>();
		q01.add("Apple");
		q01.add("Mango");
		q01.add("Fig");
		q01.add("Grape");
		q01.add("Peach");
		System.out.println(q01); //[Fig, Grape, Peach, Apple, Mango, Fig, Grape, Peach]
		
		
	}

}
