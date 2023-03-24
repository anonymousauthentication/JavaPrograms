package Practice;

public class Overloading {
	public static void main(String argss[]) {
		Overloading ol = new Overloading();
		ol.sum(20, 20);
	}

	public void sum(int a, long b) {
		System.out.println("a is invoked");
	}

	public void sum(long a, long b) {
		System.out.println("b is invoked");
	}
}
