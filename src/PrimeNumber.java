import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter number");
		int num = input.nextInt();
		primeNumberCheck(num);
	}

	public static void primeNumberCheck(int num) {
		int prime = 0;
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				prime++;
			}
		}
		if (prime == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a prime number");
		}
	}
}
