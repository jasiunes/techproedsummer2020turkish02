package day29exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E02 {

	public static void main(String[] args) {
try {
	FileInputStream fis = new FileInputStream("src/day29exceptions/TextFile");//File'a ulasmak icindir
			
			int k=0;
			
			while((k = fis.read())!=-1) {
				
				System.out.print((char) k);
				
			}
			
			fis.close();
   }catch(IOException e) {
	   System.out.println("Ya path yanlis,ya dosya silinmis,ya da dosya okunmayacak halde");
	}
	}
}
