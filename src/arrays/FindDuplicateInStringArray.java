// 13. Write a Java program to find the duplicate values of an array of string values.

package arrays;

import java.util.Scanner;

//import static arrays.ArrayUtils.*;

public class FindDuplicateInStringArray {

	public static void main(String[] args) {
		
//		String arr1[] = {"joker", "joker","many","poker","poker","jim car","jim car"};
//		ArrayUtils.printArray(getDuplicates(arr1));
		
		Scanner in = new Scanner(System.in);
		System.out.println("------------------ WELCOME, I SHALL FIND YOU THE DUPLICATE ELEMENT(S) IN AN ARRAY ------------------");
		System.out.println("But I need some information first....");
		System.out.println("-------------------------------------------------------------------------------------------------");
		int len = 0;
		while(true) {
			try {
				System.out.print("How many elements do you wish enter? (Press [ENTER] when done): ");
				len= in.nextInt();
				break;
			}catch(Exception e) {
				in.nextLine();
				System.out.println("Are you KIDDING?? I KNOW YOU KNOW I'M EXPECTING A WHOLE NUMBER! Trying to crash me are you??");
				System.out.println("If so, you should try something else, coz this ain't gonna work!");
				System.out.println("-------------------------------------------------------------------------------------------------");
			}
		}
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("Enter "+ len+" elements, and remember to press [ENTER] after each element.");
		String arr[] = new String[len];
		in.nextLine();
		
		for(int i=0;i<len;i++) {
			System.out.print("Enter element "+ (i + 1) + " : ");
			arr[i] = in.nextLine();
		}		
		in.close();
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.print("The duplicate elements are: ");
		ArrayUtils.printArray(getDuplicates(arr));
		

	}
	/*
	private static int[] getArrayOfDuplicateIndexes(String[] arr) {
		
	}
	
	public static String[] getDuplicateElements(String[] arr) {
		
	}
	*/
	
	public static String[] getDuplicates(String[] arr) {		
		arr = getDuplicatesWithLength(arr);
		
		String dupArr[] = new String[Integer.parseInt((arr[arr.length - 1]))];
		
		for(int i=0;i<dupArr.length;i++) {
			dupArr[i] = arr[i];
		}
		return dupArr;

	}
	
	/**
	 * This function takes an array and return an array of only the duplicate elements.<br/>
	 * The returned array's last value (integer value as string) will always be the number of duplicate elements
	 * in the array .<br/><hr/>
	 *
	 * @param arr The array of elements 
	 * @return array of duplicate elements
	 */
	
	private static String[] getDuplicatesWithLength(String[] arr) {
		
		String[] duplicatesArr = new String[arr.length / 2 + 1];
		int dupArrIndex = 0;
		
		for(int i=0;i<arr.length - 1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					if(!ArrayUtils.isElementInArray(arr[i], duplicatesArr,dupArrIndex)) {
						duplicatesArr[dupArrIndex++] = arr[i];
					}
				}
			}
		}
		duplicatesArr[duplicatesArr.length - 1] = dupArrIndex + "";
		return duplicatesArr;
	}
	
	
	
	

}
