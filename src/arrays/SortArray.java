//1) Write a Java program to sort a numeric array and a string array.

package arrays;

public class SortArray {

	public static void main(String[] args) {
		//Test the methods here and run the class
		
		int[] a = {10,9,8,7,6,5,4,3,2,1};
		int[] b = {1,2,3,4,5,6,7,8,9,10};
		
		String[] arr = {"zz","ax","y"};
		String[] arr2 = {"az","bx","cy","d"};
		
		printArr(sortNumericArrayAscendingOrder(a));
		printArr(sortNumericArrayDescendingOrder(b));
		
		printArr(sortStringArrayAlphabetically(arr));
		printArr(sortStringArrayReverseAlphabetically(arr2));

	}
	
	public static void printArr(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	
public static void printArr(String[] arr) {
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	
	//Takes integer array and returns array ordered in ascending order  
	
	public static int[] sortNumericArrayAscendingOrder(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
		
	}
	
	//Takes integer array and returns array ordered in Descending order  
	
	public static int[] sortNumericArrayDescendingOrder(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
			
	}
	
	public static String[] sortStringArrayAlphabetically(String[] strArr) {
		
		for(int i=0;i<strArr.length;i++) {
			for(int j=i+1;j<strArr.length;j++) {
				if(strArr[i].compareTo(strArr[j]) > 0) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
		
		return strArr;
	}
	
public static String[] sortStringArrayReverseAlphabetically(String[] strArr) {
		
		for(int i=0;i<strArr.length;i++) {
			for(int j=i+1;j<strArr.length;j++) {
				if(strArr[i].compareTo(strArr[j]) < 0) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
		
		return strArr;
	}

}
