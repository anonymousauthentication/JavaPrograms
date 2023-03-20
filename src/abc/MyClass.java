package abc;

import InterfaceDemo.calculator;

public class MyClass implements calculator {
	int a = 4;

	public static void main(String args[]) {
		MyClass sub = new MyClass();
		System.out.println(sub.a);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}
}
