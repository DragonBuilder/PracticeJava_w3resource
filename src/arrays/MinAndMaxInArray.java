// 10. Write a Java program to find the maximum and minimum value of an array.

package arrays;

public class MinAndMaxInArray {

	public static void main(String[] args) {
		
		int[] arr = {12,213,128,8912,8917};
		
		System.out.println("Minimum Element: "+minInArray(arr));
		System.out.println("Maximum Element: "+maxInArray(arr));

	}
	
	public static int minInArray(int[] arr) {
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(min > arr[i])
				min = arr[i];
		}
		
		return min;
		
	}
	
	public static int maxInArray(int[] arr) {
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++)
			if(max < arr[i])
				max = arr[i];
		
		return max;
	}

}
