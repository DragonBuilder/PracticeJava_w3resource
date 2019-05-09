// 9. Write a Java program to copy one array list into another.

package collection.arraylist;

import java.util.*;

public class CopyArrayList {

	public static void main(String[] args) {
		
		List<Integer> integers = new ArrayList<>();
		
		integers.add(5);integers.add(50);integers.add(500);integers.add(05);integers.add(55);
		integers.add(4);integers.add(54);integers.add(85);integers.add(45);integers.add(56);
		integers.add(9);integers.add(87);integers.add(55);integers.add(5);integers.add(5);
		
		List<Integer> CpyIntegers = copyList(integers);
		
		System.out.println("Original Array: " + integers);
		System.out.println("Copied Array: " + CpyIntegers);
		integers.add(788556);
		System.out.println("Original Array: " + integers);
		System.out.println("Copied Array: " + CpyIntegers);
		
		
		
		List<String> strings = new ArrayList<>();
		
		strings.add("Batman");strings.add("Superman");strings.add("Spiderman");strings.add("Wonder Woman");
		strings.add("Thanos");strings.add("Mr Doctor");strings.add("Iron Stark");strings.add("Aneesh");
		
		List<String> CpyStrings = copyList(strings);
		
		System.out.println("Original Array: " + strings);
		System.out.println("Copied Array: " + CpyStrings);
		strings.remove("Aneesh");
		System.out.println("Original Array: " + strings);
		System.out.println("Copied Array: " + CpyStrings);

	}
	
	public static <E> List<E> copyList(List<E> list){
		List<E> cpyList = new ArrayList<>();
		
		for(int i=0;i<list.size();i++)
			cpyList.add(list.get(i));
		
		return cpyList;
	}

}
