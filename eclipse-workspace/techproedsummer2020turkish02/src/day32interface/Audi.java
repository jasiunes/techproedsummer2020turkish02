package day32interface;

public class Audi implements Car,Klima{

	public static void main(String[] args) {
Audi a8 = new Audi();
a8.antiBakteri();
a8.direksiyon();
a8.isitma();
a8.teker();
a8.motor();
System.out.println(Klima.i);
	}

	@Override
	public void motor() {
		System.out.println("2.8T Turbo Benzinli");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri");
		
	}

	@Override
	public void teker() {
	System.out.println("Michelin 24 inch celik jant");
		
	}

	@Override
	public void isitma() {
		System.out.println("Akilli isitma");
		
	}

	@Override
	public void antiBakteri() {
		System.out.println("%100 bakteri koruma");
	}

	@Override
	public void fiyat() {
		
	}

	
	}


