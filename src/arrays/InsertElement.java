package arrays;

public class InsertElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5,6,7,8,9};
		printArr(insert(arr, 3, 4));
		
		String[] arr1 = {"Captain America","Iron Man","Superman","Delhi","Malayalam"};
		printArr(insert(arr1, 0, "Thor"));
		
		float[] arr2 = {1.2f,2.3f,3.4f,5.6f,6.7f,7.8f,8.9f,9.10f};
		printArr(insert(arr2, 3, 4.7f));
		

	}
	
	public static void printArr(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	
	public static void printArr(float[] arr) {
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	
	public static void printArr(String[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i != arr.length - 1)
				System.out.print(", ");
			else
				System.out.print(".");


		}
		
		System.out.println();
	}
	
	public static int[] insert(int[] arr, int index, int e) {
		
		int arrindex = 0;
		
		if(index > arr.length)
			index = arr.length;
		if(index < 0)
			index = 0;
		
		int[] newArr = new int[arr.length + 1];
		
		for(int i=0;i<newArr.length;i++) {
			if( i != index)
				newArr[i] = arr[arrindex++];
			else
				newArr[i] = e;
		}
		return newArr;
		
		
	}
	
	public static float[] insert(float[] arr, int index, float e) {
		
		int arrindex = 0;
		
		if(index > arr.length)
			index = arr.length;
		if(index < 0)
			index = 0;
		
		float[] newArr = new float[arr.length + 1];
		
		for(int i=0;i<newArr.length;i++) {
			if( i != index)
				newArr[i] = arr[arrindex++];
			else
				newArr[i] = e;
		}
		return newArr;
		
		
	}
	
	public static String[] insert(String[] arr, int index, String e) {
		
		int arrindex = 0;
		
		if(index > arr.length)
			index = arr.length;
		if(index < 0)
			index = 0;
		
		String[] newArr = new String[arr.length + 1];
		
		for(int i=0;i<newArr.length;i++) {
			if( i != index)
				newArr[i] = arr[arrindex++];
			else
				newArr[i] = e;
		}
		return newArr;
		
		
	}
	

}
