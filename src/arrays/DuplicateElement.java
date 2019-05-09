// 12. Write a Java program to find the duplicate values of an array of integer values.

package arrays;

import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {
		
//		int arr[] = {1,2,2,3,3,3,4,4,4,5,6,6,77};
//		ArrayUtils.printArrayWithLastElementAsLength(duplicateElements(arr));
//		
//		int[] arr2 = {1,2,2,3,3,3,4,4,4,5,6,6,77,0,0};
//		ArrayUtils.printArrayWithLastElementAsLength(duplicateElements(arr2));
//		
//		int[] arr3 = {1,2,3,4,5,6,7};
// 		ArrayUtils.printArrayWithLastElementAsLength(duplicateElements(arr3));
// 		/*
// 		int[] arr4 = {1,1,2,2,3,3,4,4,5,5,6,6,7,7};
// 		ArrayUtils.printArrayWithLastElementAsLength(duplicateElements(arr4));*/
//		
//		ArrayUtils.printArray(getDuplicates(arr));
//		ArrayUtils.printArray(getDuplicates(arr2));
//		ArrayUtils.printArray(getDuplicates(arr3));
		
		Scanner in = new Scanner(System.in);
		System.out.println("------------------ WELCOME, I SHALL FIND YOU THE DUPLICATE ELEMENT(S) IN AN ARRAY ------------------");
		System.out.println("But I need some information first....");
		System.out.println("MAKE SURE YOU ONLY GIVE ME NUMBERS, OTHERWISE I WILL CRASH! :(");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.print("How many elements do you wish enter? (Press [ENTER] when done): ");
		int len = in.nextInt();
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("Enter "+ len+" elements, and remember to press [ENTER] after each element.");
		int arr[] = new int[len];
		
		for(int i=0;i<len;i++) {
			System.out.print("Enter element "+ (i + 1) + " : ");
			arr[i] = in.nextInt();
		}
		in.close();
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.print("The duplicate elements are: ");
		ArrayUtils.printArray(getDuplicates(arr));
		
	}
	
	/**
	 * Returns an array with only the duplicate values from original array.
	 * @param arr
	 * @return
	 */
	
	public static int[] getDuplicates(int[] arr) {
		arr = duplicateElements(arr);
		int len = arr[arr.length - 1];
		
		int[] dupArr = new int[len];
		
		for(int i=0;i<len;i++)
			dupArr[i] = arr[i];
		return dupArr;
	}
	
	
	/**
	 * This function takes an array and return an array of only the duplicate elements.<br/>
	 * The returned array's last value will always be the number of elements to search 
	 * for in the array.<br/><hr/>
	 * <p>EXAMPLES:<br/>
	 * 	1. parameter array - [1,2,2,3,3,3,4,4,4,5,6,6,77]<br/>
	 * 	return array - [2,3,4,6,0,0,4];<br/>
	 * 		it implies that the array has 4 elements from index 0 - 3 as duplicate elements<br/>
	 * 		remaining are just place holders filled with default values.<br/>
	 * 
	 * 	2. parameter array - [1,2,2,3,3,3,4,4,4,5,6,6,77,0,0]<br/>
	 * 	return array - [2,3,4,6,0,0,0,5]<br/>
	 * 		it implies that the array has 5 elements from index 0 - 4 as duplicate elements<br/>
	 * 		remaining are just place holders filled with default values.<br/>
	 * @param arr The array of elements 
	 * @return array of duplicate elements
	 */
	private static int[] duplicateElements(int[] arr) {
		
		int len = arr.length;
		
		int[] duplicates = new int[len / 2 +1];
		int duplicatesIndex = 0;
		
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i] == arr[j]) {
					if(!(ArrayUtils.isElementInArray(arr[i],duplicates,duplicatesIndex)))
						duplicates[duplicatesIndex++] = arr[i];
				}
			}
		}
		duplicates[duplicates.length -1] = duplicatesIndex;
		return duplicates;
	}
	
	
	
}
