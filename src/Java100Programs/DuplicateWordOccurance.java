package Java100Programs;

import java.util.Scanner;

public class DuplicateWordOccurance {
	public static void main(String args[]) {
		System.out.println("Enter any String");
		Scanner sc = new Scanner(System.in);
		// String str = sc.nextLine();
		String str = "i love my country love";
		dupicateOccurance(str);
	}

	public static void dupicateOccurance(String str1) {
		// System.out.println(str);
		String str = str1.toLowerCase();
		String[] word = str.split(" ");

		for (int i = 0; i < word.length; i++) {
			int count = 0;
			for (int j = 0; j < word.length; j++) {
				if (word[i].equalsIgnoreCase(word[j])) {
					count++;
				}
			}
			System.out.println(word[i] + " " + count);
			str = str.replaceAll(word[i], "");
			System.out.println(str);
			String[] aa = str.split(" ");
			if (aa.length <= 0) {
				break;
			}
		}
	}
}
