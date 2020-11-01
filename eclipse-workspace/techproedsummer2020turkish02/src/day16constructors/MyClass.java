package day16constructors;

public class MyClass {
	
	int x;        //Intance variable
	static int y; //Static variable
	
	MyClass(int i){ //Construtor
		x+=i; //3
		y+=i;  
	}
	public static void main(String[] args) {
	new MyClass(2);
	MyClass mc = new MyClass(3);
	System.out.println(mc.x+","+mc.y);
	
	}

}
