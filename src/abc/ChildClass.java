package abc;

public class ChildClass extends BaseClass {
	static int intrestRate = 10;

	public ChildClass(String name) {

		System.out.println("Child Class Constructor" + name);
	}

	public static void main(String args[]) {
		ChildClass cc = new ChildClass("jj");
		cc.showIntrestrate1();
		cc.staticMethod();
		child cd = new child();
		cd.baseclass();
		

	}

	public static void showIntrestrate1() {
		// System.out.println(super.intrestRate);
		System.out.println("Child intrestRate = " + intrestRate);
		// super.showIntrestrate();
	}

	public void FinalMethod() {
		System.out.println("Final Method ovverride");
	}
}
class child  extends BaseClassFianl{
	public void ss() {
		System.out.println("dd");
	}
}
