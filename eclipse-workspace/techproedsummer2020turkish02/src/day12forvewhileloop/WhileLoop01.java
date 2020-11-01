package day12forvewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		//Ilk on sayma sayisini ekrana yazdiriniz.
		
		 int i = 1;
		while (i<=10) {
			System.out.print(i+" ");
			i++;
		}
	/*'NOT1:Yukaridaki kodda int i =1; ifadesi for-loop'un
	ilk bolgesi,i<=10 for-loop'un ikinci bolgesi,i
	++;for-loop ' un ucuncu bolgesi gibidir.
	Dikkat:i++; ifadesini yazmazsaniz 
	while-loop sonsuz donguye girer bu bilgisayariniza zarar verebilir.
	*/
		
	//Ilk 10 sayma sayisini buyukten kucuge yazdiriniz.
		int j=10;
		while (j>=1) {System.out.println(j+" ");
		j--;}
		
			
		// ilk 100 cift sayma sayisini yazdiran program yaziniz
		int sayma=1;
		int k = 1;
	  
		while (sayma<=100) {
			if(k%2==0) {
			System.out.print(k + " ");
			sayma++;
			}
			k++;
		}
		
		char ch ='a';
		while (ch <'j') {
			System.out.print(ch+" ");
			ch ++;
		}
	
		int sum =0;
		char s ='A';
		while (s<='E') {
			sum=sum+s;
			s++;
		}
		System.out.println(sum);	
		
	}
}

