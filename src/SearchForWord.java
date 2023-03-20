public class SearchForWord {
	public static void main(String args[]) {
		String sentence = "I Love My Country I Love My Country i love";
		String word = "Love";
		//occurance(sentence, word);
		//System.out.println(occuranceofWord(sentence, word));
		occuranceofWordcount(sentence);
	}

	private static void occurance(String sentence, String word) {
		boolean isWordPresent = sentence.contains(word);
		System.out.println(isWordPresent);
	}

	public static int occuranceofWord(String sentence, String word) {
		String[] eachWord = sentence.toLowerCase().split(" ");
		int count = 0;
		for (int i = 0; i < eachWord.length; i++) {
			if ((eachWord[i].equalsIgnoreCase(word))) {
				count++;
			}
		}
		return count;
	}

	public static void occuranceofWordcount(String sentence) {
		String ss = sentence.toLowerCase();
		String[] eachWord = ss.split(" ");
	
		for (int i = 0; i < eachWord.length; i++) {
			
			int count = 0;
			for (int j = 0; j < eachWord.length; j++) {
				if (eachWord[i].equals(eachWord[j])) {
					count++;
				}
			}
			System.out.println(eachWord[i] + " " + count);
			ss = ss.replaceAll(eachWord[i], "");	
			String ss1[] = ss.split(" ");
			if(ss1.length<=0) {
				//occuranceofWordcount(ss);
				break;
			}
		}
	}
}
