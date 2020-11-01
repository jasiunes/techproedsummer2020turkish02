package day16constructors;

public class Testt1 {
	int x =10;
	public static void main(String[] args) {
	
		Testt1 t1 =new Testt1();	
		Testt1 t2 =new Testt1();
		
		t1.x=20;
		System.out.println(t1.x+" ");//20==>t1.x=20;
		System.out.println(t2.x); //10 static olmadigi icin degismez.
	

	}

}
