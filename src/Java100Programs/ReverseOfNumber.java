package Java100Programs;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String argsp[]) {
		System.out.println("Enter Any Number to Reverse");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		reverseOfNumber(number);
		reverseOfNumber2(number);
	}
	public static void reverseOfNumber(int number) {
		int reverse=0;
		while(number!=0) {
		int r = number%10;
		reverse = (reverse*10)+r;
	        number = number/10;
		}
	        System.out.println(reverse);
	}
	
	public static void reverseOfNumber2(int number) {
		if (number<10) {
			System.out.print(number);
		}
		else {
			int r  = number%10;
			number = number/10;
			System.out.print(r);
			reverseOfNumber2(number);
		}
	}
}


