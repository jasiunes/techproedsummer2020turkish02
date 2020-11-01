package day22foreachloop;

public class CharacterTers {

	public static void main(String[] args) {
		 /*	Bir String oluþturunuz, bu String’deki character’leri yukarýdan aþaðýya
		for-each loop kullanarak yazdýrýnýz.
		Ýpucu: split()*/
	String str="Java Ogreniyorum!";
	
	String [] chr = str.split(""); 
	
	for (String w : chr) {
		System.out.println(w);
	}
	}

}
