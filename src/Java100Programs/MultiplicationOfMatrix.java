package Java100Programs;

import java.util.Scanner;

public class MultiplicationOfMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int matrix1[][] = new int[row][col];
		int matrix2[][] = new int[row][col];
		int multiplication[][] = new int[row][col];
		System.out.println("Enter First Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				multiplication[i][j] = 0;
				for (int k = 0; k < row; k++) {
					multiplication[i][j] = multiplication[i][j] + matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		System.out.println("Multiplication result");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println(multiplication[i][j]);
			}
		}
	}
}
