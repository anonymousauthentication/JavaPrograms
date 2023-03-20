package Practice;

public class ReverseString {
	public static void main(String args[]) {
		ReverseString rs = new ReverseString();
		rs.reverseString("Hello");
	}
	public void reverseString(String st) {
		for (int i = st.length() - 1; i >= 0; i--) {
			System.out.print(st.charAt(i));
		}
	}
}
