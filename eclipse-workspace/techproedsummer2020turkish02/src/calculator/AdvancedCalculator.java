package calculator;

public abstract class AdvancedCalculator implements SimpleCalculator{
public static void main(String[] args) {	
	System.out.println("AdvancedCalculator'ün Özellikleri");
}  
		abstract void usAlma();
		abstract void karekok();
		abstract void denklem ();

	@Override
	public void toplama() {
		System.out.println("Toplar");
		
	}

	@Override
	public void cikarma() {
	System.out.println("Cikarir");
	}

	@Override
	public void carpma() {
		System.out.println("Carpar");
		
	}

	@Override
	public void bolme() {
		System.out.println("Böler");
		
	}

	@Override
	public void mod() {
		System.out.println("Mod alir");
		
	}

}
