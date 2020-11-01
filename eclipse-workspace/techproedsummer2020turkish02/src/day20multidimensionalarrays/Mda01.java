package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
	 int mda[][]=new int[3][2];	
//Multi dimensional array nasil olusturulur?
//Multi dimensional array'e deger atamasi nasil yapil	
	    mda[0][0]=10;
		mda[0][1]=23;
	    mda[1][0]=7;
	 	mda[1][1]=12;
		mda[2][0]=11;
		mda[2][1]=55;
//Multi dimensional array'ler nasil console'a yazdirilir?deep
		System.out.println(Arrays.deepToString(mda));//[[10, 23], [7, 12], [11, 55]]
		System.out.println(Arrays.toString(mda[0]));//[10, 23]
		System.out.println(Arrays.toString(mda[1]));	//[7, 12]	
		System.out.println(Arrays.toString(mda[2]));//[11, 55]
//Multi dimensional array'lerde istenen bir elemani yazdirmak
		System.out.println(mda[0][0]);//10
		System.out.println(mda[1][1]);//12
		System.out.println(mda[2][0]);//11
//Multi dimensional array olusturmanin kisa yolu
	char mdac [][]= {{'a','b','c'},{'d'},{'e','f'},{'g','h','i','k'}};
		System.out.println(Arrays.deepToString(mdac));
//Soru: Yukaridaki multidimensional array'deki ilk arrayin elemanlarinin ASCII degerleri
				//toplamini ekrana yazdiriniz		
				//1. Yol:
	System.out.println(mdac[0][0]+mdac[0][1]+mdac[0][2]);
	
	//2. Yol For-loop ile
	int sum =0;
	for(int i=0;i<mdac[0].length;i++) {
		sum=sum+mdac[0][i];
	}
	System.out.print(sum);//294
	}

}
