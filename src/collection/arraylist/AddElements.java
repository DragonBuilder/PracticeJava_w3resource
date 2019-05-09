// 1. Write a Java program to create a new array list, add some colors (string) 
//	and print out the collection.

package collection.arraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AddElements {
	
	public static void main(String []args) {
		
		List<String> al = new ArrayList<>();	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int numEle = 0;
		GetLen:
			while(true) {
			try {
				numEle = in.nextInt();
				in.nextLine();
				break;
			}catch(Exception e) {
				in.nextLine();
				System.out.print("Enter a number please: ");
				continue GetLen;
				}
			}
		
		System.out.println("Enter elements(Press [ENTER] to seperate the elements): ");
		for(int i=0;i<numEle;i++) {
			al.add(in.nextLine());
		}
		
		System.out.println(al);
		in.close();
	}
	
}
