// 15. Write a Java program to find the common elements between two arrays of integers.

package arrays;

public class CommonIntegerElements {
	
	public static void main(String[] arr) {
		int[] ar = {1,2,3,4,5,6,7,8,9,0};
		int[] ar2 = {1,2,3,4,5,6,7,8,0};
		
		ArrayUtils.printArray(getCommonElements(ar, ar2));
		
		int[] ar3 = {};
		int[] ar4 = {1,2,3,4,5,6,7,8,0};
		ArrayUtils.printArray(getCommonElements(ar3, ar4));
		
	}
	
	/**
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static int[] getCommonElements(int[] arr1, int[] arr2) {
		int[] commonElementsWithLength = commonElements(arr1, arr2);
		
		int len = commonElementsWithLength[commonElementsWithLength.length - 1];
		int[] commonElements = new int[len];
		
		for(int i=0;i<len;i++) {
			commonElements[i] = commonElementsWithLength[i];
		}
		return commonElements;
	}
	
	/**
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	private static int[] commonElements(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int[] commonElements = len1 < len2?new int[len1 + 1]:new int[len2 + 1];
		int commonElementsIndex = 0;
		
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				if(arr1[i] == arr2[j]) {
					if(!ArrayUtils.isElementInArray(arr1[i], commonElements, commonElementsIndex)) {
						commonElements[commonElementsIndex++] = arr1[i];
					}
				}
			}
		}
		
		commonElements[commonElements.length -1] = commonElementsIndex;
		return commonElements;
	}
 
}
