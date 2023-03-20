package Java100Programs;

import java.util.Scanner;

public class CompareString {
	public static void main(String args[]) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		str1 = sc.nextLine();
		System.out.println("Enter Second String");
		str2 = sc.nextLine();
	}

	public static void stringCompare(String str1, String str2) {
		System.out.println(str1.compareTo(str2));
		if(str1.compareTo(str2)==0) {
			System.out.println("String are equals");
		}
		else {
			System.out.println("String are not equal");
		}
	}
}
