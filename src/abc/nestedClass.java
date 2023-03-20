package abc;

public class nestedClass {
	public static void main(String args[]) {
		nestedClass cc =new nestedClass();
		nestedClass aa = new nestedClass();
	}
	public void addd() {
		System.out.println("addd");
	}
	public class aa{
		public void add() {
			System.out.println("aa");
		}
	}
	protected class bb{
		public void add() {
			System.out.println("bb");
		}
	}
	
}
