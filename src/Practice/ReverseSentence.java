package Practice;

public class ReverseSentence {
		public static void main(String args[]) {
			reverseSentence("Hello  i am john");
		}
		public static void reverseSentence(String string) {
			String[] st = string.split(" ");
			for (int i = st.length-1;i>=0;i--) {
				System.out.print(st[i]+" ");
			}
		}
}
