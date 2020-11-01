package day19arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
		// Bir Stringi parcalara ayirmak.
		String str="Ipek topu at, topu at Ipek";
		String strArray[] = str.split(" , ");
		System.out.println(Arrays.toString(strArray));
   // str String de kac kelime var
		String sArray [] = str.split(" ");//Space var
		System.out.println(Arrays.toString(sArray));
		System.out.println(sArray.length);
    
		String tArray[] = str.split("");//Bu kod space dahil tüm characterleri ayirir.
		System.out.println(Arrays.deepToString(tArray));//
		//[I, p, e, k,  , t, o, p, u,  , a, t, ,,  , t, o, p, u,  , a, t,  , I, p, e, k]

	}

}
