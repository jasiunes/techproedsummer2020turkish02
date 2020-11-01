package day03variables;

import java.util.Scanner;

public class OdevScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Karenin alan ve cevresini bulunuz.
		System.out.println("Kare'nin kenar uzunlugunu giriniz.");
		int kenar = scan.nextInt();
		System.out.println(kenar*kenar);
		System.out.println(kenar*4);
		
		//Kullanicidan bir sayi alin kübünü bulan kod yaziniz.
		System.out.println("Bir sayi giriniz.");
		int sayi = scan.nextInt();
		System.out.println(sayi*sayi*sayi);
		
		// Boyutlari kullanicidan alinan bir dikdörtgenler prizmasinin
		//hacmini hesaplayan kod yaziniz..
		System.out.println("En,boy,yükseklik sayi giriniz.");
		int en = scan.nextInt();																																																																											
		int boy = scan.nextInt();
		int yükseklik = scan.nextInt();
		System.out.println(en*boy*yükseklik);
		
		//Dikdörtgenin alan ve cevresini bulan kod yaziniz.
		System.out.println("Dikdörtgenin kisa kenarini giriniz.");
		System.out.println("Dikdörtgenin uzun kenarini giriniz.");
		int kisa= scan.nextInt();
		int uzun= scan.nextInt();
		System.out.println(kisa*uzun);
		System.out.println(2*(kisa+uzun));
		
		//Yaricapi kullanicidan alinan bir dairenin cevresini ve alanini bulan kod yaziniz.
		
		System.out.println("Dairenin yaricapini giriniz.");
		float cap =scan.nextFloat();
		System.out.println(3.14159*cap*cap);
		System.out.println(2*3.14159*cap);
		
		//Kenar uzunlugunu kullanicidan alan ucgenin cevresini bulan kod yaziniz.
		System.out.println("Ücgenin kenar uzunluklarini giriniz.");
		byte kenar1 = scan.nextByte();
		byte kenar2 = scan.nextByte();
		byte kenar3 = scan.nextByte();
        System.out.println(kenar1+kenar2+kenar3);

        //Mil'i kilometreye ceviren bir kod yaziniz.
        //mile * 1.6;
        
        System.out.println("Mil degeri giriniz.");
        double mil = scan.nextDouble();
        System.out.println(1.6*mil);

        
        //Saati kullanicidan alan saniyeye ceviren bir kod yaziniz.
        System.out.println("Saati giriniz.");
        long saat = scan.nextLong();
        System.out.println(saat*60*60);
	
        // Kullanicidan * sembolu aliniz.
        System.out.println("Bir sembol(*) giriniz.");
        char sembol = scan.next().charAt(0);
        System.out.println(""+""+""+sembol);
        System.out.println(""+""+sembol+""+sembol);
        System.out.println(sembol+""+sembol+""+sembol);
	
        scan.close();
	}

}
