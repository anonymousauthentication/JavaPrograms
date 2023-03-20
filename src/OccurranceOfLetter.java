import java.util.Arrays;

public class OccurranceOfLetter {
	public static void main(String args[]) {

		occurranceOfWord("SANSUN");
	}
	public static void occurranceOfWord(String name) {
		String name2 = name;
		for (int i = 0; i < name.length(); i++) {
		int	count = 0;
			for (int j = 0; j < name.length(); j++) {		
				if (name.charAt(i) == name.charAt(j)   ) {
				count++;			
				}
			}
			System.out.println(name.charAt(i) + " " + count);
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