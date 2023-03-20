package Java100Programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		System.out.println("Enter Any Number To Check Palindrome");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//palindrome(number);
		ispalindrome(number);
	}
	public static void palindrome(int number) {
		String s = Integer.toString(number);
	    String rev ="";
		for(int i = s.length()-1;i>=0;i--) {
	    	rev= rev+(s.charAt(i));
	    }
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	}
	//method2
	public static void ispalindrome(int number) {
		int sum = 0;
		while(number>0) {
			int r = number%10;
			sum  = (sum*10)+r;
			number = number/10;
		}
		System.out.println(sum);
	}
}
