package day31abstraction;

public  class Cat  extends Mammal{
	/*
	 1)Concrete class'lar parent'lari olan abstract class'lardaki tüm abstract
	 methodlari override etmek zorundadirlar.Aksi takdirde CompileTime Error olusur.
	 2)Concrete class'lar parent'lari olan abstract class'lardaki concrete methodlari
	  override etmek zorunda degillerdir.
	  3)Concrete class 'lar tüm abstract parent'larindaki tüm abstract methodlari
	  override etmek zorundadirlar.Aksi takdirde Compile Time Error olusur.
	  
	 */
	public static void main(String[] args) {
		
	}

	@Override
	public void asi() {
	System.out.println("Ey kedi asi ol");	
		
	}

	@Override
	public void drink() {
		System.out.println("Su ic");
	}

	@Override
	public void feed() {
	System.out.println("Yavrularinin besle");
		
	}

	 
}
