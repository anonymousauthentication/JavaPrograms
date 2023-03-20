public class RemoveDuplicateLetter {
	public static void main(String args[]) {

		occurranceOfWord("MANOHAR");
	}
	public static void occurranceOfWord(String name) {
		String name2 = name;
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
			String st = ""+name.charAt(i);
			name2 = name2.replace(st,"");
			if(name2.length()>0) {
				occurranceOfWord(name2);
				break;
			}
		}
	}
}

/*
String st = ""+name.charAt(i);
name2 = name2.replace("", st);
if(name2.length()>0) {
	 occurranceOdWord(name2);
}
break;
*/