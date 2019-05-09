// 14. Write a Java program to find the common elements between two arrays (string values).

package arrays;

public class CommonStringElements {

	public static void main(String[] args) {
		
		String[] arr1 = {"Heath","Joker","bane","boon"};
		String[] arr2 = {"Joker","bane","Soker"};
		
		ArrayUtils.printArray(getCommonElements(arr1, arr2));

	}
	
	/**
	 * Gives an array of Strings that has only the common elements between the arrays passed.<br/>
	 * The returned array is only as long as the number of common elements between the arrays passed as arguments.
	 * @param arr1
	 * @param arr2
	 * @return a String[]
	 */
	public static String[] getCommonElements(String[] arr1, String[] arr2) {
		
		
		String[] commonElementsWithLength = commonElements(arr1,arr2); // get the array of common elements
		
		//the above array's last element is a number in String format, so get that and make an array of that size
		String[] commonElements = new String[Integer.parseInt(commonElementsWithLength[commonElementsWithLength.length - 1])];
		
		// copy the elements of 'commonElementsWithLength' array only up-to the size of 'commonElements' array.
		for(int i=0;i<commonElements.length;i++)
			commonElements[i] = commonElementsWithLength[i];
		
		return commonElements;
		
		
	}
	
	
	/**
	 * Gives back an array that has common elements of the arrays passed as arguments.<br/>
	 * The last value of the array returned is the number of elements of interest in the array returned
	 * @param arr1
	 * @param arr2
	 * @return StringArray
	 */
	private static String[] commonElements(String[] arr1, String[] arr2) {
		int len1 = arr1.length; int len2 = arr2.length;
		String[] commonElements = len1 < len2 ? new String[len1 + 1] : new String[len2 + 1];
		int commonElementsIndex = 0;
		
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				if(arr1[i].equals(arr2[j])) {
					if(!ArrayUtils.isElementInArray(arr1[i], commonElements, commonElementsIndex))
						commonElements[commonElementsIndex++] = arr1[i];
				}
			}
		}
		commonElements[commonElements.length - 1] = ""+commonElementsIndex;
		return commonElements;
	}

}
