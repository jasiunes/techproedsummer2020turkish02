
		package day03variables;

		import java.util.Scanner;

		public class Scanner02 {

			public static void main(String[] args) {
			
		        Scanner scan = new Scanner (System.in);
				System.out.println("Tam isminizi giriniz");
				String tamIsim = scan.nextLine();
				System.out.println(tamIsim);
				
				
				System.out.println("Yasinizi Giriniz");
				int yas = scan.nextInt();
				System.out.println(yas);
				
				System.out.println("Isminizin ilk harfini giriniz");
				char ilkHarf = scan.next().charAt(0);
				System.out.println(ilkHarf);
				
				System.out.println("Cocuk Sayisini giriniz");
				byte cocukSayisi = scan.nextByte();
				System.out.println(cocukSayisi);
				scan.close();
				
	}

}
