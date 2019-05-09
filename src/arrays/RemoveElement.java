// 7) Write a Java program to remove a specific element from an array.

package arrays;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		printArr(remove(arr, 5));
		
        int []arr2 = {1,2,3,3,3,4,5,6,7,8,9,10};
		
		printArr(removeAll(arr2, 3));
		

	}
	
	public static void printArr(int[] arr) {
		
		for(int i=0;i<arr.length;i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static int[] remove(int[] arr, int e) {
		
		int[] newArr;
		int arrIndex = 0;
		
		if(isElementInArray(arr, e)) {
			newArr = new int[arr.length - 1];
			
			for(int i=0;i<arr.length;i++ ) {
				if(arr[i] == e) {
					for(int j=i+1;j<arr.length;j++)
						newArr[arrIndex++] = arr[j];
					break;
				}
				else
					newArr[arrIndex++] = arr[i];
			}
		}
		else
			newArr = arr;
		
		return newArr;
		
	}
	
	public static int[] removeAll(int[] arr, int e) {
		
		int[] newArr;
		int arrIndex = 0;
		if(isElementInArray(arr, e)) {
			newArr = new int[arr.length - howManyElementsInArray(arr, e)];
			
			for(int i=0;i<arr.length;i++)
				if(arr[i] != e)
					newArr[arrIndex++] = arr[i];
		}
		else
			newArr = arr;
		
		return newArr;
		
	}
	
	public static boolean isElementInArray(int[] arr, int e) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == e)
				return true;
			
		}
		return false;
		
	}
	
	public static int howManyElementsInArray(int[] arr, int e) {
		
		int numElements = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == e)
				numElements++;
		}
		
		return numElements;
		
	}

}
