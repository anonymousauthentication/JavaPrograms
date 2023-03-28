package Practice;

public class removeDuplicateWord {
	public static void main(String args[]) {
		String str = " am i Am good  am well";
		removeDuplicate(str);
		
	}

	private static void removeDuplicate(String str) {
		String[] aa = str.toLowerCase().split(" ");
		String newStr = "";
		for(int i = 0;i<aa.length;i++) {
			if(!newStr.contains(aa[i])) {
			newStr = newStr+aa[i]+" ";
			}
		}
		System.out.println(newStr);
		
	}
}
