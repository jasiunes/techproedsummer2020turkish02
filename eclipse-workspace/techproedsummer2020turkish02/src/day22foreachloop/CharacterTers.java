package day22foreachloop;

public class CharacterTers {

	public static void main(String[] args) {
		 /*	Bir String olu�turunuz, bu String�deki character�leri yukar�dan a�a��ya
		for-each loop kullanarak yazd�r�n�z.
		�pucu: split()*/
	String str="Java Ogreniyorum!";
	
	String [] chr = str.split(""); 
	
	for (String w : chr) {
		System.out.println(w);
	}
	}

}
