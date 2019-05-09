// 5. Write a Java program to update specific array element by given element.

package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("Back");
		al.add("Back");
		al.add("Back");
		al.add("Back");
		al.add("Back");
		
		updateElementAt(1, al, "to");
		updateElementAt(2, al, "Back");
		updateElementAt(3, al, "Maybachs");
		updateElementAt(4, al, "Stack");
		al.add("the");
		al.add("M\'s");
		System.out.println(al);
		

	}
	
	public static void updateElementAt(int index,List<String> al, String e) {
		
		al.remove(index);
		al.add(index, e);
		
	}

}
