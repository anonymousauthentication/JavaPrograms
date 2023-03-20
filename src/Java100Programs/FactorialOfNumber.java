package Java100Programs;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number for Factorial");
		int number = sc.nextInt();
		factorialOfNumber(number);
	}
	public static void factorialOfNumber(int number) {
		int fact =1;
		if(number<0) {
			System.out.println("Number should not negative");
		}
		else {
		for(int i = 1;i<=number;i++) {
			 fact = fact*i;
		}
		System.out.println(fact);
	}
	}
}
