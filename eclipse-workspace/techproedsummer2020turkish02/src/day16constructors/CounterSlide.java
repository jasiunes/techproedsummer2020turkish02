package day16constructors;

public class CounterSlide {
	int count=0;
	
	 CounterSlide(){
		 this.count++;
		 System.out.println(count);
	 }

	public static void main(String[] args) {
		 CounterSlide c1 =new  CounterSlide();
		 CounterSlide c2 =new  CounterSlide();
		 CounterSlide c3 =new  CounterSlide();
	}

}
