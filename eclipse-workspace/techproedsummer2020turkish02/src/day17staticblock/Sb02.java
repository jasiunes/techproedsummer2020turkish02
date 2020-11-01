package day17staticblock;

public class Sb02 {
	int x =10;
	public static void main(String[] args) {
		Sb02 t1 = new Sb02();
		System.out.println(t1.x);
	}
	static {
	int x = 20;
	System.out.println(x+" ");
}
}
