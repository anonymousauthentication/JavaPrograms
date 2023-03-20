package Java100Programs;

public class StarPattern {
	public static void main(String args[]) {
		pattern1();
		pattern2();
		pattern3();
	}

	public static void pattern1() {
		System.out.println("Pattern 1");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

	public static void pattern2() {
		System.out.println("Pattern 2");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

	public static void pattern3() {
		System.out.println("Pattern 3");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	
	public static void pattern4() {
		System.out.println("Pattern 4");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
