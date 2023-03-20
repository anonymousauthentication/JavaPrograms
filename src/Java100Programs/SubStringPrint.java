package Java100Programs;

import java.util.Scanner;

public class SubStringPrint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		 subString(str);

	}

	public static void subString(String str) {
		String sub = null;
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				sub = str.substring(i, j);
				System.out.println(sub);
			}
		}
	}
}
