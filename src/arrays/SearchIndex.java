// 6) Write a Java program to find the index of an array element.

package arrays;

public class SearchIndex {

	public static void main(String[] args) {
		
		int[] arr = {1,5,29,9,86,2,45,67,33,23,78,12,678,996,12};
		int ser = 996;
		
		System.out.println("Index: " + searchIndex(arr, ser));
		
		ser = 45;
		System.out.println("Index: " + searchIndex(arr, ser));
		
		ser = 100;
		System.out.println("Index: " + searchIndex(arr, ser));
		
		float[] arr2 = {1.0f,5.0f,29.0f,9.0f,86.0f,2.0f,45.0f,67.0f,33.0f,23.0f,78.0f
				,12.0f,678.0f,996.0f,12.0f};
		float serF = 100.0f;
		System.out.println("Index: " + searchIndex(arr2, serF));
		
		serF = 86.0f;
		System.out.println("Index: " + searchIndex(arr2, serF));
		
		

	}
	
	public static int searchIndex(int[] arr, int ele) {
		System.out.println("Searching for: " + ele);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == ele) {
				System.out.print("Found at ");
				return i;
			}
					
		}
		System.out.println("Not Found!");
		return -1;
		
	}
	
	public static int searchIndex(float[] arr, float ele) {
		System.out.println("Searching for: " + ele);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == ele) {
				System.out.print("Found at ");
				return i;
			}
					
		}
		System.out.println("Not Found!");
		return -1;
		
	}

}
