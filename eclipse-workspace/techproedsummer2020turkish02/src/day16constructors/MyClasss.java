package day16constructors;

public class MyClasss {
	int x = 3;
	int y = 5;
	
	MyClasss(){
		x += 1;
		System.out.println("-x"+x);
	}
	MyClasss(int i){
		this();
		this.y = i;
		x += y;
		System.out.println("-x"+x);
	}
	MyClasss(int i,int i2){
		this(3);
		this.x -= 4;
		System.out.println("-x"+x);
	}

	
	public static void main(String[] args) {
		MyClasss mc1 = new 	MyClasss(4,3);

//-x4==-x7==-x3
	}

}
