package day20multidimensionalarrays;

public class MdaCarpma {

	public static void main(String[] args) {
		
		int arr1[][]= {{1,2,3},{4,5},{6}};
		
		int carp=1;
		for(int i=0;i<arr1.length;i++) {
			for(int k=0;k<arr1[i].length;k++) {
			carp=carp*arr1[i][k];
		}
	}
	System.out.println(carp);
		
	}

}
