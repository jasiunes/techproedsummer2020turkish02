package day34collections;

import java.util.LinkedList;
import java.util.List;

public class Li01 {

	public static void main(String[] args) {
		//LinkedList elemanlari giris sirasina (insertion order) göre siralar.	
		
		LinkedList<String> linkedList = new LinkedList<>();
				linkedList.add("Veli");
				linkedList.add("Aliye");
				linkedList.add("Burhan");
				linkedList.add("Canan");
				linkedList.add("Kemal");
				linkedList.add("Reyhane");
System.out.println(linkedList);	//[Veli, Aliye, Burhan, Canan, Kemal, Reyhane]					
		
			linkedList.add(1, "Cemal");
		
System.out.println(linkedList);	//[Veli, Cemal, Aliye, Burhan, Canan, Kemal, Reyhane]
 			linkedList.addFirst("Kayahan");
 			
 System.out.println(linkedList);//[Kayahan, Veli, Cemal, Aliye, Burhan, Canan, Kemal, Reyhane]
     
 			linkedList.addLast("Ayse");
       
	List<String> linkedList2 = new LinkedList<>();
		linkedList.add("XXXX");
		linkedList.add("YYYY");
		linkedList.add("ZZZZ");
		System.out.println(linkedList);
		linkedList.add(1, "Cemal");
		((LinkedList<String>) linkedList).addFirst("Kayahan");
		((LinkedList<String>) linkedList).addLast("Ayse");
		linkedList.addAll(linkedList2);
//[Kayahan, Veli, Cemal, Aliye, Burhan, Canan, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
	linkedList.addAll(5,linkedList2);
	System.out.println(linkedList);
	
	linkedList.remove(0);
	System.out.println(linkedList);
	
	linkedList.remove(1);
	System.out.println(linkedList);
	
	linkedList.remove("Canan");
	System.out.println(linkedList);//Olmayan elemani sil dersek error vermez ve silme yapamaz.
	
	linkedList.remove("YYYY");//Tekrarli elemanlarin ilkini siler.
	System.out.println(linkedList);
	
   linkedList.removeFirstOccurrence("ZZZZ");
	System.out.println(linkedList);
	 linkedList.removeLastOccurrence("XXXX");
	System.out.println(linkedList);
	
	
	linkedList.removeAll(linkedList2);//linkedList2'deki elemanlarin tamamini siler.
	System.out.println(linkedList);
	
	linkedList.removeFirst();
	System.out.println(linkedList);
	
	 linkedList.removeLast();
	System.out.println(linkedList);
	
	linkedList.removeIf(t->t.contains("a"));
	System.out.println(linkedList);
	
	}

}
