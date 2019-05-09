// 7. Write a Java program to search an element in a array list. 

package collection.arraylist;

import java.util.*;

public class SearchArrayList {

	public static void main(String[] args) {
		
		List<String> cricketers = new ArrayList<>();
		cricketers.add("Virat Kohli");
		cricketers.add("Pujara");
		cricketers.add("Ishant Sharma");
		cricketers.add("Bumrah");
		cricketers.add("Rohit Sharma");
		cricketers.add("Murali Vijay");
		cricketers.add("Ajinkya Rahane");
		cricketers.add("Hardik Pandya");
		
		System.out.println(cricketers);
		int i = searchElement(cricketers, "Bumrah");
		System.out.println("Bumrah at index : " + i);
		
		i = searchElement(cricketers, "MSD");
		System.out.println("MSD at index : " + i);
		

	}
	
	/**
	 * Searches the 'list' for the 'element' and returns its index if found, otherwise -1
	 * @param list List<String>
	 * @param element String
	 * @return integer
	 */
	public static int searchElement(List<String> list, String element) {
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(element)) {
				return i;
			}
		}
		return -1;
	}

}
