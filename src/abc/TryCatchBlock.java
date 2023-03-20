package abc;

public class TryCatchBlock {
	static int  x = 1;
	public static final void main(String args[]) {
		int number[]= {1,2,3};
		
		TryCatchBlock ss =  new TryCatchBlock();
		try {
		//ss.main();
		ss.main(args);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(number[10]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is Finally Block");
		}
	}
	class abc extends TryCatchBlock{
	public static void main() {
		System.out.println("dfs");
		System.out.println(x);
		x++;
	}
	}
}
