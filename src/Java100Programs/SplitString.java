package Java100Programs;

public class SplitString {
	public static void main(String args[]) {
		String s1 = "i Love My /s country";
	String word[] =	s1.split("/s");
	for(String s:word) {
		System.out.println(s.trim());
		
	}
	System.out.println(s1);
	System.out.println(s1.toLowerCase());
	}
}
