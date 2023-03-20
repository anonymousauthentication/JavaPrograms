public class StringReverse{
 public static void main(String args[]) {
	 String str = "Manohar Kant Joshi";
	reverse(str);
	reverseStringBuffer(str);
	reverseEachWord(str);
	reverseEachWordStringBuffer(str);
 }
 private static void reverse(String name) {
	 String rev = "";
	 for (int i=name.length()-1;i>=0;i--) {	
		 rev = rev + name.charAt(i);
	 }
	 System.out.println(rev);
 }
 
 public static void reverseStringBuffer(String str){
	 StringBuffer st =  new StringBuffer(str);
	System.out.println(st.reverse());
 }
 
 public static void reverseEachWord(String str){
	 String eachWord[] = str.split(" ");
	 for (int i=0;i<eachWord.length;i++) { 
		 for (int j = eachWord[i].length()-1;j>=0;j--) {
			 System.out.print(eachWord[i].charAt(j));
		 }
		 System.out.print(" ");
	 }
	 System.out.println("");
 }
 
 public static void reverseEachWordStringBuffer(String str) {
	 String eachWord[] = str.split(" ");
	 for (int i = 0;i<eachWord.length;i++) {
	 StringBuffer st = new StringBuffer(eachWord[i]); 
	 System.out.print(st.reverse()+ " " );
	 }
 }
}