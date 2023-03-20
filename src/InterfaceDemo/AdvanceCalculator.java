package InterfaceDemo;

public class AdvanceCalculator implements calculator {
	
	public static void main(String args[]) {
		calculator ac = new AdvanceCalculator();
	   ac.add();
	   ac.calculatecos();
	   ac.calculatesin();
	   ac.mul();
	   ac.subs();   
	}
	
	public void calculatesin(int j) {
		System.out.println("calculate sin");
		   
	}
	
	public void calculatecos() {
		System.out.println("calculate cos");
	}

	public void add() {
		System.out.println("Add Method");
		
	}
	
	public void subs() {
		System.out.println("Sub Method");
		
	}

	public void mul() {
	 System.out.println("mul method");
		
	}

}
