package day27inheritance;

public class Car extends  Vehicle{
	/*super() ile parent'da constructor cagirilirken parametrelere
	 *  dikkat edin. Parent class da olmayan bir constructor'i
	 * super() ile cagirirsaniz CTE alirsiniz.
	 * this() class icindeki constructor lari parametlere göre cagirmak icin kullanilir.
	 Aranan method constructor’i kullanilan class’da varsa o method kullanilir,
	  yoksa ayni method parent’tan kullanilir.
	 */
	
		public Car () {
			super(2);
			System.out.println("Car");
		}
		public Car (String name) {
			this();
			System.out.println("Car");
		}
	public static void main(String[] args) {
	 
		Car car = new Car("Honda");

	}

}
