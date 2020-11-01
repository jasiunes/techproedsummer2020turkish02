package day24accessmodifierstringbuilder;

public class StringTerstenYazma {

	public static void main(String[] args) {
		// //String tersten yazdirma loop ile
		StringBuilder stb5 = new StringBuilder("Java Learn");
		String s = "";
		for (int i = stb5.length()-1; i>=0; i--) {
			s=s+stb5.charAt(i);	
		}
		System.out.println(s);//relnüG ilsenüG
		
	//String tersten yazdirma StringBuilder kullanarak
	stb5.reverse();
	System.out.println(stb5);//relnüG ilsenüG*/
	
	}

}
