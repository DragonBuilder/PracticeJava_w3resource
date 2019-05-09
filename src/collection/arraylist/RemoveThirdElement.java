// 6. Write a Java program to remove the third element from an array-list. 

package collection.arraylist;

import java.util.*;

public class RemoveThirdElement {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Mohanlal");
		list.add("Mamooty");
		list.add("Dileep");
		list.add("Suresh Gopi");
		list.add("Jayaram");
		
		System.out.println(list);
		removeThirdElement(list);
		System.out.println(list);
		

	}
	
	public static void removeThirdElement(List<String> lis) {
		// Third element is at index 2.
		lis.remove(2);
	}

}
