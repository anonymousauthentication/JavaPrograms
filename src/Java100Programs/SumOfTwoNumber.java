package Java100Programs;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfTwoNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sum(a,b);
		//ss();
	}
	
	private static void sum(double a, double b) {
		System.out.println("inside double");
		System.out.println("sum = "+ (a+b));
		
	}

	public static void sum(int a , int b) {
		System.out.println("inside Int");
		System.out.println("sum = "+ (a+b));
	}
	
	public static void sum(float a , float b) {
		System.out.println("inside Float");
		System.out.println("sum = "+ (a+b));
	}
	public static void ss() {
	String number1, number2;
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter first large number");
	 number1 = in.nextLine();
	 System.out.println("Enter second large number");
	 number2 = in.nextLine();
	 BigInteger first = new BigInteger(number1);
	 BigInteger second = new BigInteger(number2);
	 BigInteger sum;
	 sum = first.add(second);
	 System.out.println("Result of addition = " + sum);

}
}