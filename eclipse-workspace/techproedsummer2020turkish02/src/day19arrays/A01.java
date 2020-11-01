package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		
		int arr[]= {3,7,1,18};
		System.out.println(Arrays.toString(arr));
// Array elemanlarini kücükten büyüge siralayalim.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//1,3,7,18
		
//Bir String array olusturun elemanlarini alfabetik sirada dizin.
	String arr2[]= {"Bal","Ari","Cicek"};
	Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));
	
	
//Bir integer Array deki en büyük ve en kücük sayiyi ekrana yazdiriniz.
	int arr3[]= {13,9,6,18,23,7,11};
	Arrays.sort(arr3);
	System.out.println(Arrays.toString(arr3));
	System.out.println("En kücük: "+arr3[0]);
	System.out.println("En büyük: "+arr3[arr3.length-1]);
	
	
//Bir String array olusturun elemanlarini alfabetik sirada dizin.
//Bastan ikinci ve sondan ikinci Stringi yazdiriniz.
	String arr4[]= {"Bal","Ari","Cicek","Günes"};
	Arrays.sort(arr4);
    System.out.println(Arrays.toString(arr4));
    System.out.println("Bastan iki: "+arr4[1]);
	System.out.println("Sondan iki: "+arr4[arr4.length-2]);
	
    
 //Bir elemanin Array de var olup olmadigini 
    int arr5[]= {2,1,7,3,5};
//Yukaridaki Array de 7 elemaninin var olup olmadigini kontrol ediniz
    int count=0; //Flag
    for(int i=0; i< arr5.length;i++) {
    	if(arr5[i]==7) {
    		count++;
    		}
    	}
	if (count!=0) {
		System.out.println("7 eleman olarak var");
	}else {
		System.out.println("7 eleman olarak var");
	}
	//2.Yol
	//Once sort() kullanmalisiniz
	Arrays.sort(arr5);
	//Aradiginiz eleman array da varsa binarySearch() size o elemanin
	//indexini verir.
	System.out.println(Arrays.binarySearch(arr5, 7));
	/*
	 * binarySearch() asla negatif bir output vermez
	 * binarySearch() asla negatif bir output verir.
	 */
	
	System.out.println(Arrays.binarySearch(arr5,6));
	//-5 verir."-" anlami yok demek.
	//6 eleman olarakar olsaydi 5. eleman olurdu(indeks no degil sirasi)
	System.out.println(Arrays.binarySearch(arr5,4)); // -4
	System.out.println(Arrays.binarySearch(arr5,99)); // -6
	
	//Bir array de tekrarli elemanlar varsa binarySearch()
	 //Bir array' de tekrarli elemanlar varsa binarySearch() methodu
	//elemanin sirasi hakkinda bazen yanilir
	int arr6 []= {1,3,8,3,11};
	Arrays.sort(arr6);
	System.out.println(Arrays.binarySearch(arr6, 3));
	
	
	
	
	
	
	
	
	}	

}
