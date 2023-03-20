package abc;

public class BaseClass {
	int intrestRate = 8;

	public BaseClass() {

		// this("Mukesh");
		System.out.println("Base class constructor");
	}

	public BaseClass(String name) {
		// this(6);
		System.out.println("Base class constructor" + name);
	}

	public BaseClass(int num) {
		System.out.println("Base class constructor" + num);
	}

	public void showIntrestrate() {
		System.out.println("Base Intrest rate = " + intrestRate);
	}

	public static void main(String arrgs[]) {
		BaseClass bb = new BaseClass();
		bb.showIntrestrate();
	}

	public final void finalMethod() {
		System.out.println("Final Method");
	}

	public static void staticMethod() {
		System.out.println("Static method Parent Class");
	}
}
final class BaseClassFianl {
	public void baseclass() {
		System.out.println("Final Class");
	}
}
