package abc;

public class DemoJava {
 int Integer = 24;
 char String = 'i';
 final int  MARKS =80;
 final int PAN_NUM;
 public DemoJava(int i) {
	PAN_NUM = i;
	 
 }
 public  static void main(String args[]) {
	 DemoJava ss = new DemoJava(5);
	 ss.aa();
 }
 public void aa() {
	
	int marks = 90;
	System.out.println(marks);
	System.out.println("PAN Number "+PAN_NUM);
	
 }
}
 
