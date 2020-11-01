package day32interface;

public interface Car {
/*
 1)interface bir class degildir.interface interfacedir..
 2)Abstract class'larin icine concrete methodlar koyabilirdik ama interfacelerin icin 
 (bazi özel durumlar haric) concrete method koyamayiz.Yani interface'ler sadece abstract 
 method icerebilir.Bu yüzden interface kullanimi "full abstraction" olarak adlandirilir.
  3)Interface'ler iclerindeki methodlari default olarak "abstract" kabul ederler.Bu yüzden method
 olustururken abstract keyword yazmak istege baglidir.Asagidaki motor() methodunda abstract keyword yazmadik
 ama direksiyon methodunda abstract keyword yazdik problem olmadi.
 4)interface icine concrete method koyarsaniz Compile Time Error verir.
 5)Interface deki methodlar default olarak "public" olurlar.Baska birsey olamazlar
 (protected-private-default olamazlar)Only public.
 6)Inteface'lerde variable'lar default olarak final olurlar.Son  deger degismez.
 7)Interface 'lerde variable'larin access modifier'lari default olarak public olur.
 8)Interface 'lerde variable'lar  default olarak "Static" olurlar.
 9)Interface 'lerde variableolusturdugunuzda mutlaka deger atamasi (initialize) yapmalisiniz.
 10)Interface'lerden obje üretilemez.
 */
	//int i = 12; == public final static int i= 12;
	int i = 12;
	public  void motor(); //engine -->motor
	
	public abstract void  direksiyon();
	void teker(); //teker() hem public 'dir hem de abstract'tir.
//void teker(); == public teker(;) == abstract void teker(); == public abstract void teker();
	void fiyat();
//Child ve Parent ayni turden ise "extends" kullanlilr
}

