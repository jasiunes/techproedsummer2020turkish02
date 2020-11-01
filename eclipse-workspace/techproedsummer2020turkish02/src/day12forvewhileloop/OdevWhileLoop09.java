package day12forvewhileloop;

public class OdevWhileLoop09 {

	public static void main(String[] args) {
	 //8 den 180 e kadar 5 in kati olan tum tamsayilari ekrana yazdiriniz.
		int i=8;
		while (i<180) 
			{if( i%5==0){
		System.out.println(i+" ");
		}i++;} 
		
		
		int k=1;
		for(k=8;k<180;k++)
		if( k%5==0) {
			System.out.println(k+"");
		}
		
	}

}
