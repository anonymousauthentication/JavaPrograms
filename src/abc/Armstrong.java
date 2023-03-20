
package abc;
import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		Armstrong armstrongNumber = new Armstrong();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		armstrongNumber.checkArmstrongNumber(num);
	}

	public void checkArmstrongNumber(int num) {
		int num2 = num;
		int s = 0;
		while(num>0) {
			int r = num % 10;
			s = s + (r * r * r);
			num = num / 10;
		}
		if (s == num2) {
			System.out.println("ArmstrongNumber");
		} else {
			System.out.println("Not a ArmstrongNumber");
		}
	}

}
