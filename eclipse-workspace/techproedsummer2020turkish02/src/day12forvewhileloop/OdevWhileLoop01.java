package day12forvewhileloop;

public class OdevWhileLoop01 {

	public static void main(String[] args) {
		
		// 1 den 100 e kadar olan sayilarin toplamini ekrana yazdiriniz.
int sum=0, i=100;
		
		while (i !=0) {
			sum+=i;
			--i;
		}
		System.out.println("Sum= " + sum);
		
	}
	
}