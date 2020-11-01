package day24accessmodifierstringbuilder;

public class Sb01 {
	/*
	 * String class her degisim icin yeni bir String olusturur  var olan String'i degistirmez.
	 * Bu yüzden Stringler "immutable" (Degistirilemez) dir denir.
	 * StringBuilder ise degisime aciktir,yeni String olusturmadan var olani degistirmek mumkünbdür.
	 * StringBuilder'lar "mutable" (Degistirilebilir) demektir.
	 */

	public static void main(String[] args) {
	// StringBuilder ile String olusturmak icin 3 farkli yol var.
		//1.Yol
		StringBuilder stb1 = new StringBuilder();  //constractr
		System.out.println(stb1);
		
		stb1.append("Java");
		System.out.println(stb1); 
		
		stb1.append("Kolaydir");
		System.out.println(stb1);
		
		//2.Yol
		StringBuilder stb2 = new StringBuilder(5);
		stb2.append("Ali");
		
		stb2.append("Kazandi");//Her tütlü degisime acik. 5 desende fazlasini da ekler 
		
		//3.Yol
		
		StringBuilder stb3 = new StringBuilder("Java");
		System.out.println(stb3);
		
		/*SORU
		 *!)3. yolu kullanarak bir String olusturun bu Stringe ekleme yapin
		 */
		StringBuilder stb4 = new StringBuilder("Günesli Günler");
		System.out.println(stb4);
		stb4.append(" Görecegiz Cocuklar").append("Motorları Maviliklere Süreceğiz...");
		System.out.println(stb4);
		System.out.println(stb4.substring(8));
		System.out.println(stb4.charAt(3));
		
		//delete() Birinci index dahil ikinci dahil degil
		System.out.println(stb4.delete(63, 65));
		
		System.out.println(stb4.getClass()); //class java.lang.StringBuilder
		
		System.out.println(stb4.indexOf("Cocuklar")); //25
		
		stb4.insert(25, "!");
		System.out.println(stb4); // Araraya ünlem koyar
		
		System.out.println(stb4.lastIndexOf("a"));//45
		System.out.println(stb4.length()); //66
		
		System.out.println(stb4.replace(55, 64, "")); //Sildi yenisini ekledi
	//String tersten yazdirma loop ile
		StringBuilder stb5 = new StringBuilder("Günesli Günler");
		String s = "";
		for (int i = stb5.length()-1; i>=0; i--) {
			s=s+stb5.charAt(i);	
		}
		System.out.println(s);//relnüG ilsenüG
		
	//String tersten yazdirma StringBuilder kullanarak
	stb5.reverse();
	System.out.println(stb5);//relnüG ilsenüG
	
	stb5.setCharAt(6, 'X');
	System.out.println(stb5); //relnüGXilsenüG
	
	//capacity()  ve length() farki?
	stb5.append("Gelsin");
	
	System.out.println(stb5.capacity()); //
	System.out.println(stb5.length());
	
	//Onemli NOT:
	StringBuilder stb6 = new StringBuilder("Java Kolay");
	//StringBuilder class'indan gelen methodlar StringBuilder'i degistirir.
	stb6.append("X");
	System.out.println(stb6);
	
	//substring() String class'inin methodudur bu yuzden StringBuilder'i update edemez.
    stb6.substring(8);
    System.out.println(stb6);//Java KolayX

    /*
    Belirlenen kapasiteyi gecerseniz kapasite belirlenen kapasitenin 2 katinin 2 fazlasi 
    olarak yazilir. Belirlenen kapasitenin 2 katinin 2 fazlasini da gecerseniz kapasite ile length
    ayni olur.
    */
	
	}

}
