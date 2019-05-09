// 11. Write a Java program to reverse an array of integer values.

package arrays;

public class ReverseTheIntArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		arr = reverseTheArray(arr);
		printArr(arr);

	}
	
	public static int[] reverseTheArray(int[] arr) {
		int []new_arr = new int[arr.length];
		int new_arr_index = 0;
		
		for(int i=arr.length-1;i>=0;i--)
			new_arr[new_arr_index++] = arr[i];
		return new_arr;
	}
	
	public static void printArr(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}

}
