// 5) Write a Java program to test if an array contains a specific value.

package arrays;

import java.util.Arrays;

public class SearchElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,6,7,83,4,5,67,8,9};
		int ser = 83;
		
		System.out.println(searchElement(arr, ser));
		ser = 6;
		System.out.println(searchElement(arr, ser));
		ser = 97;
		System.out.println(searchElement(arr, ser));
		
		

	}
	
	public static boolean searchElement(int[] arr, int ele) {
		
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length;
		int guess = (low + high) / 2;
		
		
		while(guess < arr.length) {
			//System.out.println("Low: "+ low + " High: "+high);
			//System.out.println("Guess:"+  guess);
			
			if(arr[guess] == ele)
				break;
			else if(arr[guess] < ele)
				low = guess+1;
			else 
				high = guess - 1;
			guess = (high + low) / 2;
			
			if(high < low)
				break;
		}
		
		if(guess < arr.length && arr[guess] == ele)
			return true;
		return false;
	}

}
