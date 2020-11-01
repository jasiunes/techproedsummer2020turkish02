package day32interface;

public class Honda implements Car,Klima{
/*
 1) Bir class'i bir interface'in child'i yapmak icin "implements" keyword kullaniriz.
 2) Abstract class kullanarak abstraction yaparsak bir class'a 1den fazla parent koyamayiz 
 cünkü Java multiple inheritance ' a musaade etmez.Bu yüzden interface
 kullaniriz ve bir class icin 1'den fazla parent olusturarak calisabiliriz.
 3)Birden fazla interface'i bir classs icin parent yaptiginizda,parent olan interface'lerde ayni isimli methodlar 
 methodlarin return type 'lari ayni olmak zorundadir.Ayni olmazsa Compile Time Error alirsiniz.
 3)Bir'den fazla interface'i bir class icin parent olan interface'lerde ayni isimli variabler kullanabilirsiniz.
 Ancak hangi variable'i kullanacaginiza interface ismini kullanarak siz karar vermelisiniz.Aksi takdirde Java hangisini kullanacagina karar 
  veremez bu yuzden Compile Time Error alirsiniz.
 */
	public static void main(String[] args) {
	Honda honda = new Honda ();
	honda.antiBakteri();
	honda.isitma();
	honda.motor();
	honda.teker();
	honda.fiyat();
	System.out.println(Car.i);
	
}

	@Override
	public void motor() {
	System.out.println("1,6 VTEC Diesel");
	}

	@Override
	public void direksiyon() {
	System.out.println("Suni deri");
		
	}

	@Override
	public void teker() {
		System.out.println("16 inch alasim");
}

	@Override
	public void isitma() {
	System.out.println("Isitma var");
		
	}

	@Override
	public void antiBakteri() {
System.out.println("%99 bakteri koruma");
		
	}

	@Override
	public void fiyat() {
		
		
	}
}