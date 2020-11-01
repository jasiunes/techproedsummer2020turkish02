package day27inheritance;

public class Dog extends Mammal{
	/*
	 * Java da bir class sadece bir class a extend edilebilir.
	 * Java da class in sadece bir tane parent i olabilir.
	 * Java da multiple inheritance i onaylamaz.
	2)protecded ve public methodlar inheritance a uygundurlar.
	 * private met hodlar inheritance a uygun degildir.
	 * default ayni package da iseniz inheritance a uygundur ama farkli package da iseniz uygun degildir.
	 * Kullanmak risklidir.Bu yüzden inheritance da default access modifier kullanilmaz.
	 3)Parent Class=Super Class    childClass=Sub Class
	 4)Her constructor'in ilk satirinda Aksi bir hamle yapilmadigi
	  sürece "super()" constructor call'u vardir.super() yazmak istege baglidir.
	 */
	
	public boolean loyal =true;
	
	public Dog () {
		super(); //istege bagli
		System.out.println("Dog");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.smell();
		dog.bark();
		dog.feed();

		System.out.println("Dogum?"+dog.dogum);
		System.out.println("sadik?"+dog.loyal);
		

	}
	public void bark() {
		System.out.println("Havlarlar");
	}
	
	public void smell() {
		System.out.println("Iyi koku alirlar");
	}
}
