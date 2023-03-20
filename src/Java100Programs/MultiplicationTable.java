package Java100Programs;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write Multiplication for single table and Write MultiplicationRange for Multiplication for different number");
        String choice = sc.next();
        switch(choice) {
        	case "Multiplication":
        		System.out.println("Enter Any Number for Multiplication");
        		int number = sc.nextInt();
        		multiplication(number);
        		break;
        	case "MultiplicationRange":
        		System.out.println("Enter Any Range Number for Multiplication");
        		int num1 = sc.nextInt();
        		int num2 = sc.nextInt();
        		multiplicationRange(num1, num2);
        		break;
        	default:
        		System.out.println("Enter Correct Option");
        }
	}

	public static void multiplication(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * number);
		}
	}

	public static void multiplicationRange(int number1, int number2) {
		for (int j = number1; j <= number2; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * j);
			}
		}
	}
}
