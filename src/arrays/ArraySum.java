// 2) Write a Java program to sum values of an array.

package arrays;

public class ArraySum {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Sum is: "+findSum(a));
		
		
	}
	
	
	public static int findSum(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		return sum;
		
		
	}

}
