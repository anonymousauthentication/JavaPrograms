package Practice;

public class removeSpecialChar {
	public static void main(String args[]) {
		  String str = "Hello^^%#$(!)_+ J@apneet";
	      System.out.println(removeSpecialCharacters(str));
	}

	private static String removeSpecialCharacters(String str) {
		return str.replaceAll("[@^^%#$(!)_+]", "");
		
	}
}
