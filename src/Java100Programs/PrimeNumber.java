package Java100Programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number To check Prime or Not");
		int number  = sc.nextInt();
		//isPrimeNumber(number);
		isPrimeRange(number);
	}
	public static void isPrimeNumber(int number) {
		int count = 0;
		for (int i = 1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
			if(count == 2) {
				System.out.println("Number is Prime Number");
			}
			else {
				System.out.println("Not a prime number");
			}
		}
	
	public static void isPrimeRange(int number) {
		for (int i = 1;i<=number;i++) {
			int count = 0;
			for (int j = 1;j<=number;j++ ) {
				if(i%j==0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i);
			}
		}
	}
}
