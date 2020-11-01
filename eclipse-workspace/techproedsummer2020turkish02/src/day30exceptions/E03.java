package day30exceptions;

public class E03 {

	public static void main(String[] args) {
		
		String s ="12345";
		String t ="abcde";
		
		/*Integer wrapper class'inin icindeki parseInt() methodu 
		String'leri sayiya cevirmek icin kullanilir.	*/
		
		int i =Integer.parseInt(s);
		System.out.println(i+2);//12347
		/*Eger bir String rakamlardan olusturulmamissa parseInt() methodunu kullanarak
		onu sayiya cevirmek isterseniz NumberFormatException alirsiniz.
		Cunku Java rakam disindaki charecterleri parseInt() methodu ile sayiya ceviremez.*/

		int j =Integer.parseInt(t);//NumberFormatException aliriz
		/*INTERWIEV SORULARI : "Exceptions istisnai hatalardir. 
		Ve bir sekilde cozulebilirler. Ama Errorler cozulemiyor.
		"Out of memory" (hafiza doldu hatasi, heap memorylerde).....  
	   StackOverflowError ise stack memorynin doldu hatasidir. (Stack memorylerde). 
		Temelde iki ERROR bilmelisiniz. "
		Errorlari handel edebilirmisin? Errorleri handel edemezsiniz.
	 Exceptionlar handel edilebilir ama Errorler ise bi anda durdurur sistemi...
		*/
	}

}
