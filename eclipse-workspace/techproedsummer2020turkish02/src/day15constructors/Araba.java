package day15constructors;
public class Araba {
	
	int yil 	 = 2019;
	String marka = "Toyota";
	String model = "Rav4";
	int fiyat    = 20000;
	
	Araba(String model, int fiyat){ //Neyi degistirmek istiyorsak onu parametresini yaz.
		this.model = model;		
		this.fiyat = fiyat;	
	}
	
	Araba(){	
	}
	
	Araba(String marka, String model, int yil, int fiyat){//Markayi Modeli yili fiyati degistirir.
		this.marka = marka;
		this.model = model;
		this.yil   = yil;
		this.fiyat = fiyat;
	}
	public static void main(String[] args) {
		
		Araba a1 = new Araba();
		System.out.println("Fiyat: " + a1.fiyat);//20000
		System.out.println("Marka: " + a1.marka);//Toyota
		System.out.println("Model: " + a1.model);//Rav4
		System.out.println("Yil:  "  + a1.yil); //2019
		a1.hizlanma(9);
		a1.tuketim();
		
		System.out.println("=======================");
		
		Araba a2 = new Araba("Corolla", 12000);
		System.out.println("Fiyat: " + a2.fiyat);//12000
		System.out.println("Marka: " + a2.marka);//Toyota
		System.out.println("Model: " + a2.model);//Corolla
		System.out.println("Yil:   " + a2.yil); //2019
		a2.hizlanma(7);
		a2.tuketim();
		
		//Arabanin fiyat, marka, model ve yil'ini degistirebilen bir constructor uretiniz
		//Sonra da bir obje uretip istediginiz bir araba olusturunuz.
		System.out.println("=======================");
		Araba a3 = new Araba("Audi", "R8", 2020, 50000);
		System.out.println("Fiyat: " + a3.fiyat);//50000
		System.out.println("Marka: " + a3.marka);//Audi
		System.out.println("Model: " + a3.model);//R8
		System.out.println("Yil:   " + a3.yil); //2020
		a2.hizlanma(3);
		a2.tuketim();
		
	}
	
	public void hizlanma(int i) {	  //Method ürettik.
		System.out.println(i + "sn'de 100km/sa e ulasir");//Update ettik.
	}

	public void tuketim() {
		System.out.println("km'de 0.1 dolar yakar");
	}
}









