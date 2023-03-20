package Java100Programs;

public class javaMethod {
	static {
		System.out.println("static block");
	}

	javaMethod() {
		System.out.println("Constructor called");
	}

	public static void main(String args[]) {
		staticMethod();
		javaMethod js = new javaMethod();
		js.function();
	}

	public static void staticMethod() {
		System.out.println("Static Method without object");
	}

	public void function() {
		System.out.println("function call with object");
	}
}
