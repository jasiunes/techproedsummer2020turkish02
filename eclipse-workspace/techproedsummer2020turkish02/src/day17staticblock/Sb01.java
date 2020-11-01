package day17staticblock;

public class Sb01 {
	/*
	Farzedinki bu class dairenin cevre ve alanini hesaplayacak.
	Alan=pi*r*r		Cevre=2*pi*r
	Bu class da pi sayisi her zaman kullanilacaktir.pi sayisini class 
	uretirken deger atamasini yapmak faydalidir.Eger Class �retilirken 
	bazi variable lara deger atamasi yapilmasini isterseniz static block kullanmalisiniz.
	 */
	/*Static block icinde kullanilan hersey static olmalidir.Bu y�zden asgidaki
	 �rnekte "pi" variable ini static yapmak zorundayiz.
	/*Static block main methoddan diger b�t�n methodlardan b�t�n 
	 constructor dan �nce calisir.
	 * static block class olusturulurken calisir. */
	
	static double pi;
	
	Sb01(){
		System.out.println("Constructur");
	}
	static {
		pi=3.14;
		System.out.println("Stat�c Block ALI");
	}
	public static void main(String[] args) {
		Sb01 obj1 = new Sb01();
		System.out.println("Main Method");
		
		Sb01 obj2 = new Sb01();
	}
	static {
		pi=3.14;
		System.out.println("Stat�c Block Veli");
	}
}
