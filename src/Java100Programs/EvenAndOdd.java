package Java100Programs;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();
		checkEvenOrOdd(number);
		checkEvenOrOddPrint(number);
	}
	//method1
	public static void checkEvenOrOdd(int number) {
		if(number%2==0) {
			System.out.println("Number is Even");
		}
		else
			System.out.println("Number is odd");
	}
	
	//method 2
	public static void checkEvenOrOddPrint(int number) {
		for (int i = 0;i<=number;i++) {
		if(i%2==0) {
			System.out.println(i+" is Even");
		}
		}
	}
}
