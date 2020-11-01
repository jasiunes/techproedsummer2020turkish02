package day18arrays;

public class Array04 {

	public static void main(String[] args) {
		//Not same aynilar ama adresler farkli
		
		int arr1 []= {1,2,3};
		int arr2 []= {1,2,3};
		    if (arr1==arr2) 
		System.out.println("Same"); 
		    else 
			System.out.println("Not Same"); 
		
		 String []	cities = { "London","Paris","Rome","New York"};
		 System.out.println(cities[cities.length-2]); //Roma
		 System.out.println(cities[cities.length-1]); //Newyork

}
}