// 3. Write a Java program to insert an element into the array list at the first position.

package collection.arraylist;

import java.util.*;

public class InsertIntoFirst {

	public static void main(String[] args) {
		
		/*List<String> al = ArrayListUtils.getTheArrayListOfStrings();
		al = insertIntoFirst((ArrayList)al, "Java");
		
		//Custom class in the same package
		IterateThroughList.iterateThroughList(al);*/
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Lamar");
		al2.add("is");
		al2.add("the");
		al2.add("best");
		
		//al2 = (ArrayList)insertIntoFirst(al2, "Kenrick");
		insertIntoFirstUsingAddAPI(al2,"Kenrick");
		IterateThroughList.iterateThroughList(al2);

	}
	
	public static List<String> insertIntoFirst(ArrayList<String> al, String e) {
		
		List<String> new_al = new ArrayList<String>();
		
		new_al.add(e);
		new_al.addAll(al);
		return new_al;
	}
	
	public static void insertIntoFirstUsingAddAPI(ArrayList<String> al, String e) {
		
		al.add(0, e);
	}
	

}
