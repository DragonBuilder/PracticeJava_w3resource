// 19. Write a Java program to add two matrices of the same size.

package arrays;

import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = in.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = in.nextInt();
		
		int[][] mat1 = new int[rows][cols];
		int[][] mat2 = new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.printf("Enter(%d,%d) for matrix1 => ",i+1,j+1);
				mat1[i][j] = in.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.printf("Enter(%d,%d) for matrix2 => ",i+1,j+1);
				mat2[i][j] = in.nextInt();
			}
		}
		
		in.close();
		int[][] result = new int[rows][cols];
		result = addMatrices(mat1, mat2);
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				System.out.printf("%2d ", result[i][j]);
			System.out.println();
		}

	}
	
	/**
	 * Adds two matrices and returns the result.
	 * It assumes the matrices in the parameter has at-least one element.
	 * @param matrix1 integer[][]
	 * @param matrix2 integer[][]
	 * @return result integer[][]
	 */
	public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[matrix1.length][matrix1[0].length];
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[0].length;j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	}

}
