// 22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.

package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author aneesh anil
 *
 */

public class ElementPairsOfSum {

	public static void main(String[] args) {
		int[] arrofNums = {1, 2, 3, 4, 5, 6, 7};
		int sum  = 7;
		
		
		//List<int[]> pairs = pairsOfSum(arrofNums, sum);
		//List<int[]> pairs = pairsOfSumForSorted(arrofNums, sum);
		
		List<int[]> pairs = pairsOfSumForUnsorted(arrofNums, sum);
		
		System.out.print("Pairs that add upto " + sum + " in ");
		ArrayUtils.printArray(arrofNums);
		System.out.println("are : ");
		Iterator<int[]> pairsItr = pairs.iterator();
		while(pairsItr.hasNext()) {
			int[] currPair = pairsItr.next();
			ArrayUtils.printArray(currPair);
		}
		
		

	}
	
	/**
	 * 
	 * @param arrOfNums an array of numbers
	 * @param sum an integer value
	 * @return List each array in list is a pair that adds up to sum
	 * <p>Complexity O(n^2)</p>
	 */
	public static List<int[]> pairsOfSum(int[] arrOfNums, int sum){
		List<int[]> pairsOfSum = new ArrayList<>();
		for(int i=0;i<arrOfNums.length;i++) {
			for (int j=i+ 1;j<arrOfNums.length;j++) {
				int[] aPair = new int[2];
				
				int currSum = arrOfNums[i] + arrOfNums[j];
				if (currSum == sum) {
					aPair[0] = arrOfNums[i];
					aPair[1] = arrOfNums[j];
					pairsOfSum.add(aPair);
				}
				
			}
		}
		
		return pairsOfSum;
	}
	
	/**
	 * 
	 * @param arrOfNums a sorted array of numbers
	 * @param sum an integer value
	 * @return List each array in list is a pair that adds up to sum
	 * <p>Complexity O(n)</p>
	 */
	
	public static List<int[]> pairsOfSumForSorted(int[] arrOfNums, int sum){
		
		
		List<int[]> pairsOfSum = new ArrayList<>();
		
		// two pointers, one starts at the begining, the other at the ned of the array
		int i=0, j=arrOfNums.length - 1;
		
		
		while ( j > i) {
			int currentSum = arrOfNums[i] + arrOfNums[j];
			
			if (currentSum == sum) {
				pairsOfSum.add(new int[] {arrOfNums[i], arrOfNums[j]});
				i++;
				j--;
			}else if (currentSum > sum) {
				j--;
			}else {
				i++;
			}
		}
		
		return pairsOfSum;
		
	}
	
	/**
	 * 
	 * @param arrOfNums a sorted/unsorted array of numbers
	 * @param sum an integer value
	 * @return List each array in list is a pair that adds up to sum
	 * <p>Complexity O(n)</p>
	 */
	public static List<int[]> pairsOfSumForUnsorted(int[] arrOfNums, int sum){
		/* ALGORITHM:
		 * 
		 * For every element in the array, 
		 * check if that element is present in a hashset(why? 'contains()' is a constant time operation),
		 * if No:
		 * 		Subtract this number from the sum and add it to the hashset
		 * 
		 * if Yes: 
		 * 		Then the current number and subtraction of current number from sum will form a pair!
		 */
		List<int[]> pairsOfSum = new ArrayList<>();
		
		Set<Integer> diffs = new HashSet<>();
		
		for (int i = 0; i < arrOfNums.length; i++) {
			
			int diff = sum - arrOfNums[i];
			
			if (diffs.contains(arrOfNums[i])) {
				pairsOfSum.add(new int[] { diff, arrOfNums[i] });
			}
			diffs.add(diff);
		}
		
		return pairsOfSum;
	}

}
