package Java100Programs;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row");
		int row = sc.nextInt();
		System.out.println("Enter number of col");
		int col = sc.nextInt();
		int mat[][] = new int[row][col];
		int trans[][] = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				trans[j][i] = mat[i][j];
			}
		}
		System.out.println("Transpose Matrix");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.println(trans[i][j]);
			}
			System.out.println("");
		}
	}
}