package day20multidimensionalarrays;

public class MdaCarp01 {

	public static void main(String[] args) {
    
		int arr[][]= {{1,2,3},{4,5,6}};
		
		int product=1;
	
		for(int i =0; i<arr.length ; i++) {
			product *=arr[i][arr[i].length-1];
		
		}System.out.println("Son elemanlar Carpimi ="+product);
	}
}


