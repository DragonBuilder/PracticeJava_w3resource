// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.

package collection.arraylist;

import java.util.List;

public class RetrieveElement {

	public static void main(String[] args) {
		List<String> al = ArrayListUtils.getTheArrayListOfStrings();
		
		int index = 2;
		System.out.println(getElementAt(index, al));

	}
	
	public static String getElementAt(int index, List<String> al) {
		return al.get(index);
	}

}
