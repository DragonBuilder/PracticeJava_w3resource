// 10. Write a Java program to shuffle elements in a array list.

package collection.arraylist;

import java.util.*;

public class ShuffleArrayList {

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
		shuffle(alphabets);
		System.out.println("Shuffled array: " + alphabets);

	}
	
	/**
	 * Given a list, this method shuffles the elements within.
	 * @param list List
	 */
	public static <E> void shuffle(List<E> list) {
		
		int listSize = list.size();
		
		// Start from the first element
		for(int i=0;i<listSize;i++) {
			
			/* System.out.println("   I: "+ i);
			System.out.println("   " + list); */
			
			Random nextIndex = new Random();
			
			// Pick an index that occurs after the current index
			int toShuffleWithIndex = nextIndex.nextInt(listSize - i) + i;
			
			// swap the current element with the randomly chosen index.
			swap(list, i, toShuffleWithIndex);
		}
	}
	
	private static <E> void swap(List<E> list, int index1, int index2) {
		E e1 = list.get(index1);
		E e2 = list.get(index2);
		
		list.remove(index1);
		list.add(index1, e2);
		
		list.remove(index2);
		list.add(index2, e1);
	}

}
