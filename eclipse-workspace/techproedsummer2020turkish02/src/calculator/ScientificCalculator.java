package calculator;

public abstract class ScientificCalculator extends AdvancedCalculator{

	public static void main(String[] args) {
		
		System.out.println("ScientificCalculator'�n �zellikleri");
	
	}
     abstract void logaritma();
	
	abstract void trigonometri();
	
	abstract void integral();

	@Override
	void usAlma() {
		System.out.println("Scientific us alir.");
		
	}

	@Override
	void karekok() {
		System.out.println("Scientific karekok alir.");
		
	}

	@Override
	void denklem() {
		System.out.println("Scientific denklem c�zer");
		
	}
	
	@Override
	public void toplama() {
		System.out.println("Scientific toplama yapar.");
		super.toplama();
	}
	@Override
	public void cikarma() {
		System.out.println("Scientific cikarma yapar.");
		super.cikarma();
	}
	@Override
	public void carpma() {
		System.out.println("Scientific carpma islemi yapar.");
		super.carpma();
	}
	@Override
	public void bolme() {
		System.out.println("Scientific b�lme yapar.");
		super.bolme();
	}
	@Override
	public void mod() {
		System.out.println("Scientific mod alir.");
		super.mod();
	}

}
