package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class L01 {
/*
 *1) Arraylerin uzunluklari en basta belirlenir ve bir daha degistirilemez.
 List(ArrayList)lerde ise ist olustururken uzunluk belirlemeye gerek yoktur cunku
 Listler eleman eklendikce kendilerini büyütürler eleman silindikce kendilerini kücültürler.
 2)Listler cok kullanisli methodlara sahiptir bu yuzden arrayler göre daha cok tercih edilirler
 3)Array'ler Primitive ve reference'lari eleman olarak kabul ederler.
 Ama Listler sadece nun-primitive'leri eleman olarak kabul eder.
*/

	public static void main(String[] args) {
		//List olusturma nasil yapilir?
		//1.Yol
		ArrayList<String> sl = new ArrayList<String>();
		
		//2.Yol:
		ArrayList<String> sl1=new ArrayList<>();
		
		//3.Yol
	List<String> sl3 = new ArrayList<>();
		System.out.println(sl3);
		//List 'e eleman eklemek nasil yapilir?
		sl3.add("A");
		System.out.println(sl3);
		
		sl3.add("B"); // add() her zaman en sona ekler		
	   System.out.println(sl3);//[A, B]
		
	    sl3.add("C");
		System.out.println(sl3);//[A, B, C]
		
		//Herhangi bir indekse ekleme nasil yapilir?
		
		sl3.add(1,"X");
		System.out.println(sl3); //[A, X, B, C]
		
		sl3.add(0, "Mustafa");
		System.out.println(sl3); //[Mustafa, A, X, B, C]
		
		//List'lerde eleman sayisini nasil buluruz?
	    System.out.println(sl3.size());
		
	    //Bir List'in bos olup olmadigini nasil anlariz?
	   System.out.println(sl3.isEmpty()); //isEmpty()==>bos ise true,doluysa false

	  //Bir List'den istenen elemani silme nasil yapilir?
	 
	  // 1.Yol index ile silme yapabilirsiniz.
	  System.out.println(sl3.remove(0)); //Mustafa yazar sildigi elemani yazar.
	  sl3.remove(0);  //Remove uzaklastirmak demek.
	 /* remove() methodunun icine tamsayi koyarsaniz Java onu index kabul eder. 
	  Bu yuzden elemanlari integer olan bir listteki elemanlari silmek icin 
	  remove() methodunun sadece indexlisini kullanabilirsiniz.*/
	  System.out.println(sl3);  //[A, X, B, C]
	  
	  //2.Yol eleman secip silmek
	  sl3.remove(1);
	  System.out.println(sl3);  //[A,B,C]
	  
	  sl3.add("B");  //[A, B, C, B]
	  System.out.println( sl3.add("B"));//true verdi silebildigi icin.
	  sl3.remove("B");//[A, C, B] ayni eleman varsa ilkini siler.
	  System.out.println(sl3);
	  
	  //Java' dan olmayan bir elemani silmeye calisalim remove edemez listi oldugu gibi birakir.
	  sl3.remove("W");
	  System.out.println(); //[A, C, B]
	  System.out.println(sl3.remove("W")); //false islemi yapamadim
	  
	  //remove(index) ne return eder?
	  //sl3==> [A,C,B]
	  System.out.println(sl3.remove(1)); //C
	  System.out.println(sl3); // [X,B]
	  
	  //remowe(eleman) ne return eder?
	  System.out.println(sl3.remove("B")); //true der eleman bellidir siz bizzat girdiniz.
	}

}
