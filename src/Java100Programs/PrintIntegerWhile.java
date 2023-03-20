package Java100Programs;

import java.util.Scanner;

public class PrintIntegerWhile {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		// printInt();
		// printInt2();
		// printint3();
		printint4();
	}

	public static void printInt() {

		int n;
		System.out.println("Run this Program until you enter zero");
		while ((n = sc.nextInt()) != 0) {
			System.out.println(n);
		}
		System.out.println("Program End");
	}

	public static void printInt2() {
		System.out.println("Second Logic started");
		System.out.println("Run this Program until you enter zero");
		int n;
		do {
			n = sc.nextInt();
			System.out.println(n);
		} while (n != 0);

		System.out.println("Program Ends");

	}

	public static void printint3() {

		while (true) {
			int n = sc.nextInt();
			System.out.println(n);

			if (n == 0) {
				break;
			}
		}

	}

	public static void printint4() {

		while (true) {
			int n = sc.nextInt();

			if (n != 0) {
				continue;

			} else {
				break;
			}
		}

	}
}
