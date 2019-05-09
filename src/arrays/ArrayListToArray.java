// 21. Write a Java program to convert an ArrayList to an array.

package arrays;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Object> strs = new ArrayList<>();
		strs.add("Unbox Therapy");
		strs.add("Coding Train");
		strs.add("Migos");
		strs.add("Travis Scott");
		strs.add("No Bullshit");
		strs.add("Daisy Cousens");
		strs.add("IGN");
		strs.add("Last Week Tonight");
		strs.add("PewDiePie");
		
		Object[] strsArr = toArray(strs);
		
		for(int i=0;i<strsArr.length;i++) {
			System.out.print(strsArr[i]);
			if(i == strsArr.length-1)
				System.out.print(".");
			else
				System.out.print(", ");
				
		}

	}
	
	public static Object[] toArray(ArrayList<Object> arrayList) {
		Object arr[] = new Object[arrayList.size()];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = arrayList.get(i);
		
		return arr;
		
		
	}

}
