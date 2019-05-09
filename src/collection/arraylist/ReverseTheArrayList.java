// 11. Write a Java program to reverse elements in a array list.

package collection.arraylist;

import java.util.*;

public class ReverseTheArrayList {

	public static void main(String[] args) {
		List<String> alphabets = new ArrayList<>();
		alphabets.add("A");
		alphabets.add("B");
		alphabets.add("C");
		alphabets.add("D");
		alphabets.add("E");
		alphabets.add("F");
		alphabets.add("G");
		alphabets.add("H");
		alphabets.add("I");
		alphabets.add("J");
		alphabets.add("K");
		
		System.out.println("Original array: " + alphabets);
		reverse(alphabets);
		System.out.println("Reversed array: " + alphabets);

	}
	
	/**
	 * Given a list, reverses the list
	 * @param list List
	 */
	public static <E> void reverse(List<E> list) {
		
		for(int i=0;i<list.size() / 2;i++) {
			swap(list, i, list.size() - 1 - i);
		}
		
	}
	
	private static <E> void swap(List<E> list, int i, int j) {
		E e1 = list.get(i), e2 = list.get(j);
		
		list.remove(i);
		list.add(i, e2);
		
		list.remove(j);
		list.add(j, e1);
	}

}
