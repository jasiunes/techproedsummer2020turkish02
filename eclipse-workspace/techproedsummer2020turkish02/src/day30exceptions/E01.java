package day30exceptions;

public class E01 {
/*
 *1)Kod yazarken kirmizi alt cizgi almadiginiz halde,kodu calistirdiktan sonra console'da kirmizi mesaj alirsaniz
 *buna Run Time Exception denir.
 *a)AritmeticExeption bir Run Time Exception'dir.Bir sayiyi sifir a bölerseniz bu exception'i alirsiniz.
 *b) null atanmis bir String'in lenght'ini bulmak isterseniz NullPointerException alirsiniz.
 * */
	public static void main(String[] args) {
		
		int a =12;
		int b=0;
		String s1 ="";
		String s2=null;
	
	try {
		System.out.println(a/b);
	}catch(ArithmeticException e) {
		System.out.println("Bir sayiyi sifira bölemezsiniz!");
	}
	System.out.println(s1.length()); //4
	System.out.println(s2.length());//java.lang.NullPointerException verir.
}
}