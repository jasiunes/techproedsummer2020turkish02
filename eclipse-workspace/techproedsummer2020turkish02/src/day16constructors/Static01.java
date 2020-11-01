package day16constructors;

public class Static01 {
int num1=12;
static int num2=22;
	public static void main(String[] args) {
Static01 obj = new Static01();
obj.artirma();
obj.artirma();
	}
	public void artirma() {
		num1++;
		System.out.println(num1);
	}
	}

