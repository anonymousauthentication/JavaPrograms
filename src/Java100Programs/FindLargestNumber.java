package Java100Programs;

import java.util.Scanner;

public class FindLargestNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//largestnumber(a,b);
		largestnumber(a,b,c);
	}
	
	private static void largestnumber(int a, int b) {
		// TODO Auto-generated method stub
		int c = (a>b)?a:b;
		System.out.println("Largest number is "+c);
	}

	public static void largestnumber(int a , int b, int c) {
		//method1
		if(a>b) {
			if(a>c) {
				System.out.println(a+" is largest Number");
			}
		}
		else {
		if(b>c) {
			System.out.println(b+" is largest Number");
		}	
		else {
			System.out.println(c);
		}
		}
		//method 2 
		int d = (a>b)?a:b;
		int large = d>c?d:c;
		System.out.println("LL: "+large);
		//method 3
		int largest = c > (a>b ? a:b) ? c:((a>b) ? a:b); 
	}
}
