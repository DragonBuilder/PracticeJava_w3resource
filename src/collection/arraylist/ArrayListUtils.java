package collection.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A Utility Class
 * The other classes in this package may use the methods available in this class.
 * @author White Dragon
 *
 */
public class ArrayListUtils {
	
	public static void main(String[] args) {
	}
	
	public static List<Integer> getTheArrayListOfIntegers() {
		
		System.out.println("ARRAYLIST INPUT");
		System.out.print("How many elements do you wish to enter?: ");
		Scanner in = new Scanner(System.in);
		
		int len = in.nextInt();
		List<Integer> al = new ArrayList<>();
		System.out.println("START ENTERING "+len+" ELEMENT(S)");
		for(int i=0;i<len;i++) {
			System.out.print("Enter element "+(i+1)+": ");
			al.add(in.nextInt());
		}
		in.close();
		return al;
		
		
	}
	
	public static List<String> getTheArrayListOfStrings() {
		
		System.out.println("ARRAYLIST INPUT");
		System.out.print("How many elements do you wish to enter?: ");
		Scanner in = new Scanner(System.in);
		
		int len = in.nextInt();
		in.nextLine();
		List<String> al = new ArrayList<>();
		System.out.println("START ENTERING "+len+" ELEMENT(S)");
		for(int i=0;i<len;i++) {
			System.out.print("Enter element "+(i+1)+": ");
			al.add(in.nextLine());
		}
		in.close();
		return al;
		
		
	}
	
	/**
	 * Swaps the element at index index1 with the element at index2 in the given list.
	 * @param list
	 * @param index1
	 * @param index2
	 */
	public static <E> void swap(List<E> list, int index1, int index2) {
		E e1 = list.get(index1);
		E e2 = list.get(index2);
		
		list.remove(index1);
		list.add(index1, e2);
		
		list.remove(index2);
		list.add(index2, e1);
	}

}
