package day36collectionsmaps;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {
		/*
		 *1)HashMap'ler rastgele siralama yapar.
		 *2)Map'lerde "key" degerleri "unique" olmak zorundadir,"value" tekrarli olabilir.
		 */
		
     HashMap<Integer,String> hm01= new  HashMap<>();
     hm01.put(100,"Ali");//{100=Ali}
     hm01.put(101,"Emine");
     hm01.put(102,"Veli");
     hm01.put(103,"Ayse");//{100=Ali, 101=Emine, 102=Veli, 103=Ayse}
     
     //Ayni key degeri ile ikinci defa "put()" kullanirsaniz üstüne yazar.
     hm01.put(102, "XXXX"); //{100=Ali, 101=Emine, 102=XXXX, 103=Ayse}
     
     //Ayni value ama key farkli ise ekleme yapar ayni value tekrarli olarak kullanilabilir.
     hm01.put(104, "XXXX");
     
     //"Key" null kabul eder mi? Cevap.Kabul eder ama sadece bir tane kabul eder.
     //Ikinci defa null key kullanilirsaniz üstüne yazar.
     hm01.put(null, "YYYY");  //{null=YYYY, 100=Ali, 101=Emine, 102=XXXX, 103=Ayse, 104=XXXX}
     hm01.put(null, "ZZZZ");
     
     //HashMap value olarak "null" kabul eder mi?Cevap:HashMap value olarak 1'den fazla "null" kabul eder.
     hm01.put(105, null);
     hm01.put(106, null);
     hm01.put(107, null);
     //{null=ZZZZ, 100=Ali, 101=Emine, 102=XXXX, 103=Ayse, 104=XXXX, 105=null, 106=null, 107=null}
     
     
     System.out.println(hm01); 
     System.out.println(hm01.containsKey(102));      //true
     System.out.println(hm01.containsKey(12));       //false
     System.out.println(hm01.containsKey("Ayse"));   //true
     System.out.println(hm01.containsKey("Ramazan")); //false
      
     //Map'lerde herhangi bir elemanin "Value" sunu almak icin 
     //"get()" methodu "key" parametresi ile kullanilabilir.
     System.out.println(hm01.get(101)); //Emine
     
     //Key" varsa o key'e ait return eder,""
     System.out.println( hm01.getOrDefault(101, "Öyle bir isim yok")); //Emine
     System.out.println(hm01.getOrDefault(11, "Öyle bir isim yok"));  //yokkkk
     
     //Tüm key leri bir arada görmek isterseniz keySet()methodu kullanin.     
     System.out.println(hm01.keySet());//[null, 100, 101, 102, 103, 104, 105, 106, 107]
     //Tüm key leri bir arada görmek isterseniz keySet()methodu kullanin.    
     System.out.println(hm01.values());//[ZZZZ, Ali, Emine, XXXX, Ayse, XXXX, null, null, null]
     
     System.out.println(hm01.putIfAbsent(108, "Kemal"));//Absend key'lere bakar.
     System.out.println(hm01);
     
     System.out.println(hm01.putIfAbsent(108, "Muharrem"));//Eklemedi muharrem'i 108 var diye
     System.out.println(hm01);
     //Asagidaki kod "key'si null olan elemani siler.
     hm01.remove(null);//Key si null olan elemani remove eder siler.
     System.out.println(hm01); //null,ZZZZ bitti.
     
     //Iki sarta göre silme yapar,key 103 ve value Ayse ise siler.
     hm01.remove(103,"Ayse");
     System.out.println(hm01);
     
    // 102 de value vahid ise siler degilse silmez error da vermez.
     hm01.remove(102,"Vahid");
     System.out.println(hm01);
     
     //replace(102,"Mustafa"   ile   put(102 "Mustafa") ayni seyi yapar.
     hm01.replace(102, "Mustafa");
     System.out.println(hm01);
     		 hm01.replace(105,null,"Jackson");
     		 System.out.println(hm01);
     		 
     		 System.out.println(hm01.size());//8
     
     
	}

}
