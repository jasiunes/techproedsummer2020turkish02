package day37maps;

import java.util.Hashtable;

public class Ht01 {
/*
 * Soru: HashMap ile Hashtable'in farki nedir?
  Cevap: 1)HashMap not-synchronized ve not-threadsafe'dir ama Hashtable synchronized ve threadsafe'dir.
	     2)HashMap 1 tane null key ve 1'den fazla null value kabul eder ama Hashtable key icin de value icin de null kabul etmez.
	     3)HashMap hizli, HashTable yavastir.
 * 
 /*
 Note:Note: Hashtable elemanlari rastgele siralar

 */
	public static void main(String[] args) {
	Hashtable <Integer,String> ht = new Hashtable<>();
	ht.put(100, "Ali");
	ht.put(101, "Veli");
	ht.put(102, "Aylin");
	ht.put(103, "Emine");
	//ht.put(null, "Ramazan");//Kullanilirsa "NullPointerException" aliriz
							//HashTable' da key icin null kullanilmaz
	
	//ht.put(104, null);///Kullanilirsa "NullPointerException" aliriz
						//HashTable' da key icin null kullanilmaz
	
	System.out.println(ht.get(100)); //Ali
	
	ht.putIfAbsent(101, "Kemal"); //101 key yoksa Kemal'i map'e yerlestirir.Key varsa yerlestirmez.
	
	System.out.println(ht); //{103=Emine, 102=Aylin, 101=Veli, 100=Ali}
	
	
	
	}

}
