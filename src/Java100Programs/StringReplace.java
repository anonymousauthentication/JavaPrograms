package Java100Programs;

public class StringReplace {
	public static void main(String args[]) {
		String a1 = "I love my country is, my name is john";
		String replace= a1.replaceAll("is", "was");
		System.out.println(replace);
		String str = "xyz";
		str.replace("y", "JAVA");
		System.out.println(str);
	}
}
