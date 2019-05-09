package arrays;

/**
 * 
 * @author White Dragon
 * Contains a bunch of utility functions for array.
 */

public class ArrayUtils {
	
	/**
	 * Prints the array elements, but takes the last element in the array as the
	 * number of elements to print.
	 * @param arr
	 */
	public static void printArrayWithLastElementAsLength(int[] arr) {
		int len = arr[arr.length-1];
		
		if(len == 0) {
			System.out.println("No Elements");
			return;
		}
		for(int i=0;i<len;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	/**
	 * Prints the array elements, but takes the last element in the array as the
	 * number of elements to print.
	 * @param arr
	 */
	public static void printArrayWithLastElementAsLength(String[] arr) {
		int len = Integer.parseInt(arr[arr.length-1]);
		
		if(len == 0) {
			System.out.println("No Elements");
			return;
		}
		for(int i=0;i<len;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	/**
	 * Prints an array of integers.
	 * @param arr
	 */
	public static void printArray(int[] arr) {
		if(arr.length < 1) {
			System.out.println("NO ELEMENTS IN ARRAY");
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1)
				System.out.print(", ");
			else
				System.out.println(".");
		}
	}
	
	/**
	 * Prints an array of String.
	 * @param arr
	 */
	public static void printArray(String[] arr) {
		if(arr.length < 1) {
			System.out.println("NO ELEMENTS IN ARRAY");
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1)
				System.out.print(", ");
			else
				System.out.println(".");
		}
		
		System.out.println();
	}
	
	/**
	 * Prints an array of floats.
	 * @param arr
	 */
	public static void printArray(float[] arr) {
		if(arr.length < 1) {
			System.out.println("NO ELEMENTS IN ARRAY");
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1)
				System.out.print(", ");
			else
				System.out.println(".");
		}
	}
	/**
	 * Checks if Element 'e' is in the given array 'arr'.<br/>
	 * But only searches upto the index 'elementsInArr' - 1
	 * @param e
	 * @param arr
	 * @return boolean
	 */
	
	public static boolean isElementInArray(String e, String[] arr, int elementsInArr) {
		
		for(int i=0;i<elementsInArr;i++) {
			if(arr[i].equals(e))
				return true;
		}
		return false;
	}
	
	/**
	 * Checks whether the given element 'e' is in the array 'arr'.,br/>
	 * But only searches upto the index 'elementsInArr' - 1
	 * @param e
	 * @param arr
	 * @param elementsInarr
	 * @return
	 */
	
	public static boolean isElementInArray(int e, int[] arr, int elementsInArr) {
		for(int i=0;i<elementsInArr;i++) {
			if(arr[i] == e)
				return true;
		}
		return false;
	}
	

}
