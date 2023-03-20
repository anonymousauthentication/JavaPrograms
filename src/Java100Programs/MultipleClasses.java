package Java100Programs;

import Java100Programs.Laptop.aa;

public class MultipleClasses {
	MultipleClasses(int i) {
		System.out.println(i);
		System.out.println("multiclasses constructor");
	}

	public void multipleclassMethod() {
      System.out.println("MultiClassMethod");
	}
	public static void main(String args[]) {
		main();
		System.out.println("Main Method");
		MultipleClasses mp = new MultipleClasses(5);
		mp.multipleclassMethod();
		Laptop ll =new Laptop();
		ll.laptop();
		ll.ss();
	
	}
	public static void main() {
		System.out.println("Main Method without argument");
	}
	
}
class Laptop{
	Laptop(){
	 System.out.println("Laptop constructor");
	}
	public void laptop() {
		System.out.println("Lapto Methop");
	}
	
	protected class aa{
		public void aaMethod() {
			System.out.println("aaMethod");
		}
		
	}
	public void ss() {
		aa n =  new aa();
		n.aaMethod();
	}
}
