package day22foreachloop;

import java.util.Arrays;

public class Socrative {

	public static void main(String[] args) {
	
int arr [][]= {{1,2},{3},{4,5,6}};

int sum=0;
for(int[] w : arr) {
	for(int z : w) {
		sum=sum+z;
	}
}

System.out.println(sum);
	
	}

}
