package Practice;

public class RemoveWhiteSpace {
	public static void main(String args[]) {
		String st = "john is a good boy";
		removeWhiteSpaces(st);
		String sr = removeWhiteSpacess(st);
		System.out.println("\n");
		System.out.println(sr);
	}

	public static void removeWhiteSpaces(String str) {
		String[] st = str.split(" ");
		for (int i = 0; i <st.length; i++) {
          System.out.print(st[i]);
		}
	}
	
	public static String removeWhiteSpacess(String str) {
	String newst = str.replaceAll("\\s", "");

	return newst;
	}
}
