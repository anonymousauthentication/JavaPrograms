package Java100Programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		isArmstrong(number);
	}
	public static void isArmstrong(int number) {
		int digit=0;
		double sum = 0;
		int temp = number;
		int armStorng = number;
		while(temp!=0) {
			digit++;
			temp = temp/10;
		}
		while(number!=0) {
		int r = number%10;
	    sum = sum + (Math.pow(r, digit));
	    number = number/10;
		}
	   int sum1 =(int)sum;
	   if(sum1 == armStorng) {
		   System.out.println("Armstrong Number");
	   }
	   else {
		   System.out.println("Not a Armstrong Number");
	   }
	}
}
