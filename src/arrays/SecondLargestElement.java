// 17. Write a Java program to find the second largest element in an array.

package arrays;
/**
 * 
 * @author Aneesh Anil
 *
 */

public class SecondLargestElement {

	public static void main(String[] args) {
		int []arr = {1,200,3,4,5,6,7,8,9, 100, 101};
		
		//int[] arr2 = {};
		
		int []arr3 = {1,2};
		
		System.out.println(getSecondLargestElement(arr));
		System.out.println(getNthLargestElement(arr, 2));
		
		//System.out.println(getSecondLargestElement(arr2));
		//System.out.println(getNthLargestElement(arr2, 0));
		
		System.out.println(getSecondLargestElement(arr3));
		System.out.println(getNthLargestElement(arr3, 2));
	
	}
	
	// Assume the array has at-least N elements
	/**
	 * Get the Nth largest element in the given array 'arr'.<br/>
	 * Assumes that the array has at-least N elements.
	 * @param arr integer[]
	 * @param N integer
	 * @return integer
	 */
	public static int getNthLargestElement(int[] arr, int N) {
		
		if(N == 1) {
			return arr[getLargestIndex(arr)];
		}
		else {
			return getNthLargestElement(removeElementAtIndex(arr, getLargestIndex(arr)), N - 1);
		}
	}
	
	// assumes the array has at-least 2 elements
	/**
	 * Given an array of at-least 2 elements finds the 2nd largest element in the array.
	 * @param arr
	 * @return integer
	 */
	public static int getSecondLargestElement(int[] arr) {
		int largestElementIndex = getLargestIndex(arr);
		arr = removeElementAtIndex(arr, largestElementIndex);
		
		return arr[getLargestIndex(arr)];
	}
	
	// assume the array has an element at the index
	/**
	 * Given an array and an index, this function returns an array <br/>
	 * without the element at the given index
	 * 
	 * @param arr integer[]
	 * @param index integer
	 * @return integer[]
	 */
	private static int[] removeElementAtIndex(int[] arr, int index) {
		int[] copyArray = new int[arr.length - 1];
		int cpyIndex = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(i == index)
				continue;
			copyArray[cpyIndex++] = arr[i];
		}
		return copyArray;
	}
	
	// assume the array has at-least 1 element
	/**
	 * Finds and returns the largest element's index in the array arr.<br/>
	 * @param arr integer[]
	 * @return integer
	 */
	private static int getLargestIndex(int[] arr) {
		int largest = arr[0];
		int largest_index = 0;
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
				largest_index = i;
			}
		}
		return largest_index;
	}

}
