package Java100Programs;

public class HandleException {
	public static void main(String args[]) {
		try {
		int c = 10/0;
		System.out.println("Divisin result is = "+c);
		}
		catch(Exception e){
			System.out.println( e);
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
