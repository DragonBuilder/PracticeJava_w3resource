// 8. Write a Java program to sort a given array list.

package collection.arraylist;

import java.util.*;

public class SortArrayList {

	public static void main(String[] args) {
		
		List<String> alphabets = new ArrayList<>();
		alphabets.add("C");
		alphabets.add("A");
		alphabets.add("D");
		alphabets.add("f");
		alphabets.add("g");
		alphabets.add("b");
		alphabets.add("j");
		alphabets.add("i");
		alphabets.add("o");
		alphabets.add("y");
		alphabets.add("z");
		System.out.println("Original array: " + alphabets);
		
		//bubbleSort(alphabets);
		mergeSort(alphabets, 0, alphabets.size() - 1);
		
		System.out.println("Sorted Array: " + alphabets);
		
		//System.out.println("C".compareTo("A"));

	}
	
	/**
	 * Sorts the given list of String using the Bubble Sort Technique.
	 * @param list List<String>
	 */
	public static void bubbleSort(List<String> list) {
		
		System.out.println("Bubble sort...");
		
		// Outer Loop... Each iteration of this loop pushes the largest element of the list to the last spot
		for(int i=0;i<list.size();i++) {
			
			// Inner Loop... from 0 to size - i - 1...
			for(int j=0;j<list.size() - 1 - i;j++) {
				
				//Get element at index j
				String a = list.get(j);
				//System.out.println("a: " + a);
				
				// Get element at index j + 1
				String b = list.get(j + 1);
				//System.out.println("b: "+ b);
				
				// if element at index j is greater than element at j + 1 , swap their places.
				if(a.compareTo(b) > 0) {
					//System.out.println("a > b ? " + (a.compareTo(b)));
					
					list.remove(j);
					list.add(j, b);
					list.remove(j+1);
					
					list.add(j + 1 , a);
				}
			}
		}
	}
	
	/**
	 * Sorts the given list using Merge Sort Technique
	 * @param list List<String>
	 * @param low integer
	 * @param high integer
	 */
	public static void mergeSort(List<String> list, int low, int high) {
		
		if(low < high) {
			
			int mid = (low + high) / 2;
			
			mergeSort(list, low, mid);
			mergeSort(list, mid + 1, high);
			
			merge(list, low, mid, high);
		}
	}
	
	/**
	 * Merges two sorted sub-lists from [low ... mid] and [mid+1 ... high] into a single sorted sub-list from [low ... high] 
	 * @param list
	 * @param low
	 * @param mid
	 * @param high
	 */
	private static void merge(List<String> list ,int low, int mid, int high) {
		
		//Get the length of left and right sub-lists 
		int left_length = mid - low + 1;
		int right_length = high - mid;
		
		//Make left and right sub-lists
		List<String> left = new ArrayList<>();
		List<String> right = new ArrayList<>();
		
		/* Initialize left and right sub-lists with proper values */
		
		// left = list[low...mid]
		for(int index = 0;index<left_length;index++) {
			left.add(list.get(low + index));
		}
		
		// right = list[mid+1...high]
		for(int index = 0;index<right_length;index++) {
			right.add(list.get(mid + 1 + index));
		}
		
		// POINTERS
		// left sub-list and right sub-list pointers
		int left_i=0, right_i = 0;
		// pointer to keep track of list (main-list))
		int k = low;
		
		// Compare and insert the lower value to list[k] if there are elements to go through in both sub-lists
		while(left_i < left_length && right_i < right_length) {
			String left_list_element = left.get(left_i);
			String right_list_element = right.get(right_i);
			
			// Since the main list in going to get an new element at index k, remove the current element at index k.
			list.remove(k);
			
			// Element at left[left_i] occurs before right[right_i] alphabetically 
			if(left_list_element.compareTo(right_list_element) < 0) {
				list.add(k, left_list_element);
				left_i++;
			}
			// Element at right[right_i] occurs before left[left_i] alphabetically
			else {
				list.add(k, right_list_element);
				right_i++;
			}
			
			// Increment k by 1 in each iteration
			k++;
		}
		
		// If there are elements left in left sub-list add them to the main list
		while(left_i < left_length){
			list.remove(k);
			String left_list_element = left.get(left_i);
			list.add(k, left_list_element);
			left_i++;
			k++;
		}
		
		// If there are elements left in right sub-list add them to the main list
		while(right_i < right_length){
			list.remove(k);
			String right_list_element = right.get(right_i);
			list.add(k, right_list_element);
			right_i++;
			k++;
		}
		
	}

}
