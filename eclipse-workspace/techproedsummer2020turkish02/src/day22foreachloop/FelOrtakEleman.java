package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FelOrtakEleman {

	public static void main(String[] args) {
		// Iki String Array olusturun bu Arraylerdeki ortak elemanlari forEachloop kullanarak bulunuz.
		//Ortak eleman yoksa  "Ortak eleman yok" yazdiriniz.
		
		String arr1 []= {"Günes","Böcek","Ari","Cicek","Bal"};	
		String arr2 []= {"Günes","Sinek","Ari","Cicek","Dal"};	
		List<String> ayniElemanlar = new ArrayList<>();

		     for(String w : arr1) 
		     for(String w2 : arr2) 	 
		    	 
		    	 if(w.equals(w2)) {
						ayniElemanlar.add(w);
					}
			
		
			if(ayniElemanlar.isEmpty()) {
				System.out.println("Ayni eleman yok");
			}else {
				System.out.println(ayniElemanlar);
			}
	}}