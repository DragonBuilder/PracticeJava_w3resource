// 4) Write a Java program to calculate the average value of array elements.

package arrays;

public class Average {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(getAverage(arr));
		
		float[] arr2 = {1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f,10.10f};
		System.out.println(getAverage(arr2));
		

	}
	
	public static float getAverage(int[] arr) {
		float sum = 0.0f;
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			sum += arr[i];
		}
		return (sum / len);
	}
	
	public static float getAverage(float[] arr) {
		float sum = 0.0f;
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			sum += arr[i];
		}
		return (sum / len);
	}

}
