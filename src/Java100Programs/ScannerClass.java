package Java100Programs;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String args[]) {
		printString();
	}
	public static void printString() {
		System.out.println("Enter Any String : ");
		Scanner sc = new Scanner(System.in);
		String str2 = sc.next();
		System.out.println(str2);
	}
}
