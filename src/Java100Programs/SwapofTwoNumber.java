package Java100Programs;

public class SwapofTwoNumber {
	public static void main(String args[]) {
		SwapTwoNumber(2,3);
		SwapTwooNumber(2,3);
	}
	public static void SwapTwoNumber(int a , int b) {
		
		System.out.println("With Third Variable");
		System.out.println("Value Before Swap: a = "+a+" b = "+b );
		int c = 0 ;
		 c = a;
		 a = b;
		 b = c;
		 System.out.println("Value after Swap: a = "+a+" b = "+b );
	}
	
	public static void SwapTwooNumber(int a , int b) {
		
		System.out.println("\nWithout Third Variable");
		System.out.println("Value Before Swap: a = "+a+" b = "+b );
		a = a + b;
		b = a - b;
		a = a - b;
		 System.out.println("Value after Swap: a = "+a+" b = "+b );
	}
}
