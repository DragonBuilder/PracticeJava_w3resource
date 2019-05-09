// 18. Write a Java program to find the second smallest element in an array.

package arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(getSecondSmallestElement(arr));
		
		int []arr2 = {200, 300, 400, 5};
		System.out.println(getSecondSmallestElement(arr2));

	}
	
	/**
	 * Returns the second smallest element in the given array.
	 * @param arr integer[]
	 * @return integer
	 */
	public static int getSecondSmallestElement(int arr[]) {
		
		return getNthSmallestElement(arr, 2);
		
	}
	
	/**
	 * Returns the Nth Smallest element in the given array.
	 * @param arr[] integer
	 * @param N
	 * @return
	 */
	public static int getNthSmallestElement(int arr[], int N) {
		
		// If the N is 1, return the smallest element in the array.
		if(N == 1) {
			return arr[getSmallestIndex(arr)];
		}
		// Else remove the smallest element and call the same method again, with N-1.
		else {
			arr = removeElementAtIndex(arr, getSmallestIndex(arr));
			return getNthSmallestElement(arr, N - 1);
		}
	}
	
	/**
	 * Removes the element at the 'index' of the array and returns a new array.
	 * @param arr[] integer
	 * @param index integer
	 * @return integer[]
	 */
	private static int[] removeElementAtIndex(int[] arr, int index) {
		
		//The array to be returned
		int cpy[] = new int[arr.length - 1];
		// The start index of the new array
		int cpyIndex = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			// copy the element of 'arr' array to 'cpy' array if the 'i' is not 'index'.
			if(i != index)
				cpy[cpyIndex++] = arr[i];
		}
		return cpy;
	}
	
	/**
	 * Returns the index of the smallest element in the array 'arr'.
	 * @param arr[] integer
	 * @return integer 
	 */
	private static int getSmallestIndex(int[] arr) {
		int smallest = arr[0];
		int smallest_index = 0;
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
				smallest_index = i;
			}
		}
		return smallest_index;
	}

}
