package day16constructors;

public class Counter {
	int count;
	static int stCount;
	
	public Counter() {
		count ++ ;
		stCount ++;
	}
	public int getCount() {
		return count;
	}
	public static int getStCount() {
		return stCount;
	}
	public class TestCounter {}
	
	public static void main(String[] args) {
	Counter cs1 = new Counter();
	Counter cs2 = new Counter();
	Counter cs3 = new Counter();
	Counter cs4 = new Counter();
	Counter cs5 = new Counter();
	Counter cs6 = new Counter();
	System.out.println("count is: "+cs6.getCount());//1
	System.out.println("stCount is: "+cs1.getStCount());//1
	}

	}
