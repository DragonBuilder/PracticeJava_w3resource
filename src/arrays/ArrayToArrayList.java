// 20. Write a Java program to convert an array to ArrayList.

package arrays;

import java.util.ArrayList;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		Integer[] intArr = {1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> arrayListOfInteger = toArrayList(intArr);
		System.out.println("ArrayList: " + arrayListOfInteger);
		
		String[] strArr = {"Michael De Santa", "Trevor Philips", "Franklinn","Lamar"};
		ArrayList<String> arrayListOfStrings = toArrayList(strArr);
		System.out.println("ArrayList: " + arrayListOfStrings);
	}
	
	/**
	 * Returns an ArrayList of the elements in the array arr.
	 * @param arr
	 * @return
	 */
	public static <T> ArrayList<T> toArrayList(T[] arr){
		ArrayList<T> arrList= new ArrayList<>();
		
		for(T arrE : arr)
			arrList.add(arrE);
		
		return arrList;
	}
}
