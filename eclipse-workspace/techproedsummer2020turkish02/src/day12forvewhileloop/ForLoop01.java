package day12forvewhileloop;

public class ForLoop01 {

	public static void main(String[] args) {
		// Ilk 30 sayma sayisinin toplamini ekrana yazdiran program yaziniz.
		
			int sum = 0;
			for(int i=1; i<=30; i++) {
			sum = sum+i;}
		//Sadece final sonucu görmek isterseniz syso ifadesini for-loop disina 
			System.out.println(sum);
		
		//Ilk 10 sayma sayisinin carpimini ekrana yazdiran programi yaziniz.
		//Matematikte 1*2*3**4*5 ifadesine 5!denir.
			//Interview sorusu 7! hesabini yapan bir program yaziniz.
			
			int product = 1;
			for(int i=1; i<=10; i++) {
				product = product*i;}
			System.out.println(product);
			
	//100 ile 200 arasindaki 3 ile bölünebilen sayilarin toplamini
	//bulan bir program yaziniz.
			
			int sum1= 0;
			for(int i=101; i<200; i++) 
			if(i%3==0) {
				sum1=sum1+i;
			}
			System.out.println(sum1);
	}

}
