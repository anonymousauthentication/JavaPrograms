package Practice;

public class ReverseEachWord {
	public static void main(String args[]) {
		reverseEachWord("john is a good boy");
	}
	public static void reverseEachWord(String str) {
		String[] st = str.split(" ");
		for (int i = st.length-1;i>=0;i--) {
			//System.out.print(st[i]+" ");
			for(int j = st[i].length()-1;j>=0;j--) {
				
				System.out.print(st[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}
