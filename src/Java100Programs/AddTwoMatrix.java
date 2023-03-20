package Java100Programs;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoMatrix {
	public static void main(String args[]) {
		matrixSum();

	}

	public static void matrixSum() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of row for Matrix 1");
		int row = sc.nextInt();
		System.out.println("Enter number of col fot Matrix 1");
		int col = sc.nextInt();
		int matrix1[][] = new int[row][col];
		int matrix2[][] = new int[row][col];
		int sum[][] = new int[row][col];
		System.out.println("Enter Elemennt for Mattrix 1");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Elemennt for Matrix 2");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		// sum matix code
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
        //print output of sum matrix
		System.out.println("Sum of the matrix are");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println(sum[i][j]);
			}
		}

	}
}
