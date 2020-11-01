package calculator;

public class GraphicCalculator extends ScientificCalculator{
	

	public static void main(String[] args) {
		System.out.println("GraphicCalculator'ün özellikleri.");
		GraphicCalculator graphic=new GraphicCalculator();
		graphic.bolme();
		graphic.carpma();
		graphic.toplama();
		graphic.cikarma();
		graphic.mod();
		graphic.denklem();
		graphic.graphic();
		graphic.integral();
		graphic.karekok();
		graphic.logaritma();
		graphic.usAlma();

	}
	public void graphic() {
		System.out.println("GraphicCalculator Graphic cizebilir");
	}
	@Override
	void logaritma() {
		System.out.println("Graphic, logaritma bulur.");
	}
	@Override
	void trigonometri() {
		System.out.println("Graphic, trigonometri hesaplar.");
	
	}
	@Override
	void integral() {
		System.out.println("Graphic, integral bulur.");
	}
	@Override
	void usAlma() {
		System.out.println("GraphicCalculator usAlir.");
		super.usAlma();
	}
	@Override
	void karekok() {
		System.out.println("GraphicCalculator karekok alir.");
		super.karekok();
	}
	@Override
	void denklem() {
		System.out.println("GraphicCalculator denklem cözer");
		super.denklem();
	}
	@Override
	public void toplama() {
		System.out.println("GraphicCalculator tabiki toplama yapar.");
		super.toplama();
	}
	@Override
	public void cikarma() {
		System.out.println("GraphicCalculator Cikarir.");
		super.cikarma();
	}
	@Override
	public void carpma() {
		System.out.println("GraphicCalculator carpar");
		super.carpma();
	}
	@Override
	public void bolme() {
		System.out.println("GraphicCalculator böler.");
		super.bolme();
	}
	@Override
	public void mod() {
		System.out.println("GraphicCalculator mod alir.");
		super.mod();
	}

}
