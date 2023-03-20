package Java100Programs;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String args[]) {
		System.out.println("Enter Two Integer");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		try {
			int result = a/b;
			System.out.println("Result = "+result);
		}
		catch(Exception e){
			System.out.println("Eception caught : Division by Zero");
			System.out.println(e.getMessage());
			System.out.println("Rest of the code");
		}
	}
}
