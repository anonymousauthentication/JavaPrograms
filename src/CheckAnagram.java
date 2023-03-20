import java.util.Arrays;

public class CheckAnagram {
	public static void main(String args[]) {
		String str = "silent";
		String str2 = "listen";
		boolean cl = isAnagram(str, str2);
		System.out.println(cl);
	}
	public static boolean  isAnagram(String str,String str2) {
	
		if(str.length()!=str2.length()) 
			return false;
		  char[] c1 = str.toCharArray();
		  char[] c2 = str2.toCharArray();
		  Arrays.sort(c1);
		  Arrays.sort(c2);
		  return Arrays.equals(c1, c2);
		
	}
}
