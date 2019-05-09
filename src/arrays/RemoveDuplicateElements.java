// 16. Write a Java program to remove duplicate elements from an array.

package arrays;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,8};
		ArrayUtils.printArray(removeDuplicatesInArray(arr));
		
		int arr1[] = {1,3,4,5,6,7,8,9,3,0};
		ArrayUtils.printArray(removeDuplicatesInArray(arr1));

	}
	
	/**
	 * Returns an array with all the duplicate elements removed.
	 * @param arr
	 * @return
	 */
	
	public static int[] removeDuplicatesInArray(int[] arr) {
		int[] nonDuplicatesWithLength = removeDuplicates(arr);
		
		int len = nonDuplicatesWithLength[nonDuplicatesWithLength.length - 1];
		int[] nonDuplicates = new int[len];
		
		for(int i=0;i<len;i++) {
			nonDuplicates[i] = nonDuplicatesWithLength[i];
		}
		
		return nonDuplicates;
		
	}
	
	/**
	 * Returns an array where the duplicate elements of the given array 'arr' <br/>
	 * are removed and the last element of the returned array is the number of elements of <br/>
	 * interest in that array.
	 * @param arr
	 * @return int[]
	 */
	private static int[] removeDuplicates(int[] arr) {
		
		int[] nonDuplicates = new int[arr.length + 1];
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(!ArrayUtils.isElementInArray(arr[i], nonDuplicates, index))
				nonDuplicates[index++] = arr[i];
		}
		
		nonDuplicates[nonDuplicates.length - 1] = index;
		return nonDuplicates;
	}

}
