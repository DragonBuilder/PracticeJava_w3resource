//2. Write a Java program to iterate through all elements in a array list.

package collection.arraylist;

import java.util.Iterator;
import java.util.List;

public class IterateThroughList {

	public static void main(String[] args) {
		
		List<String> al = ArrayListUtils.getTheArrayListOfStrings();
		
		iterateThroughList(al);
		
		

	}
	
	public static void iterateThroughList(List<String> al) {
		
		System.out.println("Iterating through the list........");
		
		Iterator<String> iter = al.iterator();
		int count = 1;
		while(iter.hasNext()) {
			System.out.println("ELEMENT "+ (count++) +": "+iter.next());
		}
	}
	
	

}
