package day28;

public class Dog extends Animal{
	/*
	1)Parent daki methodu method signature ini degistirmeden body'sini 
	  degistirerek Child class da kullanmaya "Method Overriding" denir.
	2)Parent Class daki private method lar ovveride edilemez.
	parent class taki private methodlar @override edilemezler. 
	Neden cunku override demek bu metodu baska classta kullanilamaz demek.
	 Kullanamaysin. JAWA kiziyor.Ya public yapmalisin ya da burada artistlik yapma diyor.
	3)final method'lar override edilemezler.Cunkü final methodlarin body leri.Olabilecekleri son haldedir.
	 Yani method body'leri degistirilemezler.Halbuki overriding amaci method body i degistirerek methodu kullanmaktir.
	 Bu celiskiden
	4)Static methodlar override edilemezler.Cunku static methodlar zaten ortak kullanima aciktir.
	 Onun body'sini degistirmek herkesi etkiler bu yüzden Java static methodlarin override
	 edilmesine müsaade etmez.
	 5)Child class daki override edilmis methodun Overriding edilmis access modifier i Parent
	 class daki override edilen 
	 6)Child class daki ovirride edilmis methodun return type ya parent class daki  override  edilmismethodun 
	 return type ile ayni olur veya onun child larindan biri olabilir.
	 
	 */
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
	}
	public void sound() {
	System.out.println("Havlarlar");
}
	@Override  //Annotation:Bu asagidaki methodun ovverride kurallarina 
			 //uygun olarak override edilip edilmedigini kontrol eder.
	public void numOfFoot() {
	System.out.println("A ayaklari vardir.");
}
}
