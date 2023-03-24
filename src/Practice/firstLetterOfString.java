package Practice;

public class firstLetterOfString {
	public static void main(String args[]) {
		String str = "Hello Manohar";
		fistLetterString(str);
	}

	public static void fistLetterString(String str) {
		String word = "";
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			word = st[i];
			System.out.println(word.charAt(0));
		}
	}
}
