package day11stringmethodsforloopdt;

public class ForLoop01 {

	public static void main(String[] args) {
		// Loop dongu demektir.Bir seyi tekrar tekrar yapmak
		/*Ekrana 10 defa "Java" yazdiralim.
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");*/
		
		//Yukaridaki isi for-Loop kullanarak kisaca yapabiliriz.
		// Baslangic  Condition    Artirma/Azaltma
		for(int i =1 ;	i<=10	  ;	i++	 			) {
			System.out.println("Java");}
		//1 den 5 e kadar sayilari ekrana yazdirlaim
		for (int i = 1; i<=5 ; i++) {System.out.println(i);
		}
		//4 den 1 e kadar sayilari yazalim
		for (int i = 4; i>=1 ; i--) {System.out.println(i);}
		
		//Ekrana ilk uc cift sayma sayisini yazdiriniz.(2,4,6)
		//1.YOL
		for(int i =2; i<=6 ; i+=2) {System.out.println(i);}
		//2.YOL
		for(int i=1;i<=6;i++) {
			if(i%2==0) {
				System.out.println(i);
				}
			}
		
		for(int i=1;i<=9;i++) {
			if(i%2!=0) {
				System.out.println(i);}
			}
	
	}
}
