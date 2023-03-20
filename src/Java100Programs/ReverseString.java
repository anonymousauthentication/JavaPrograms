package Java100Programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String to Reverse");
		String str = sc.nextLine();
		reverseString(str);
 	}
	public static void reverseString(String str) {
		System.out.println(str.length());
		for(int i = str.length()-1 ;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}
