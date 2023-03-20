package Java100Programs;

public class ThrowException {
	static void validate(int age) {
		if (age < 18) 
			throw new ArithmeticException("Not valid");
		 else
			System.out.println("Welcome  to vote on ");

	}

	public static void main(String args[]) {
		validate(13);
		System.out.println("rest of the code");

	}
}
