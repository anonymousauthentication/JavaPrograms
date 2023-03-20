package Java100Programs;

public class ComparetwoString {
    public static void main(String[] args) {
    	String a1 = new String("hello");
    	String a2 = new String("hello");
    	String s1 = "hello";
    	String s2 = "hello";
    	String s3 = "Neklo";
    	System.out.println(s1.compareTo(s3));
    	System.out.println(a1);
    	System.out.println(s1==s2);
    	System.out.println(a1==a2);
    }
}
