// 8. Write a Java program to copy an array by iterating the array.

package arrays;

public class CopyArray {
	
	public static void main(String[] args) {
		
		// array
		int arr[]= {100,200,500,400,270,560};
		// print the array
		printArr(arr);
		// make a copy of the array
		int cpyArr[] = copyArray(arr);
		// print the copy
		printArr(cpyArr);
		
		// change an element of the original array
		arr[2] = 8;
		// print the arrays.
		//NOTICE THAT A CHANGE IN ORIGINAL ARRAY DOES'T AFFECT THE COPY.
		printArr(arr);
		printArr(cpyArr);
		
	}
	
	public static int[] copyArray(int[] arr) {
		int []newArr = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
			newArr[i] = arr[i];
		
		return newArr;
	}
	
	public static void printArr(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	

}
