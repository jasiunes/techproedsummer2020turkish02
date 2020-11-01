package day16constructors;

public class Test1 {
	
	static int x = 10;

	public static void main(String[] args) {
		Test1 t1 =new Test1();	
		Test1 t2 =new Test1();
		
		t1.x=20;
		System.out.println(t1.x+" ");//20
		System.out.println(t2.x); //20
	
	}

}
