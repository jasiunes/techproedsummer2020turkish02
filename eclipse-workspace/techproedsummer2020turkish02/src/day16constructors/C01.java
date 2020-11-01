package day16constructors;

public class C01 {
	
	int i = 12; //instance (object)variable
	static int k = 13;// static (class)variable
	public static void main(String[] args) {
		// 
		C01 obj1 = new C01();
		obj1.i = 20;
		System.out.println(obj1.i);
		
		obj1.k = 30;
		System.out.println(obj1.k);//30
		
		C01 obj2 = new C01();
		System.out.println(obj2.i);
		System.out.println(obj2.k);//30
		
		
		/*1-Static variable 'lar calss'lara aittir ve diger adi class variabledir.
		 * .Instance variable 'lar object ' lere aittir ve diger adi object variabledir.
		 *2-static variable'lardaki degisiklikler kim tarafindan yapilirsa yapilsin butun
		 *objeler  tarafindan g�rulur.
		 *Intance variable larda ise degisiklikler sadece o instance variable hangi obje ye aitse 
		 *onun tarafindan g�rulur.
		 *3-static variable'lar class'lar olusturulurken Java tarafindan olusturulur
	 Instance variable'lar ise object'ler olusturulurken olusturulur.
	 4)1 class, class icinde 1 tane static ve 1 tane de instance variable var.
	 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane 
	 instance variable uretilmis demektir. 	 
	*/

		
		
		
		
		
		

	}

}
