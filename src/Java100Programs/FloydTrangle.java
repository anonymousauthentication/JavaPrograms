package Java100Programs;

import java.util.Scanner;

public class FloydTrangle {
	public static void main(String args[]) {
		System.out.println("Enter Number of Row for Flyod Trangle");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		floydTrangle(row);
	}

	public static void floydTrangle(int row) {
		int number = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println("\n");

		}
	}
}
