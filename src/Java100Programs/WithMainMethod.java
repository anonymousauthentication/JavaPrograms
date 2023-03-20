package Java100Programs;

public class WithMainMethod {
    static
    {
        System.out.println(
            "This class can be executed without main");
        System.exit(0);
    }
    public static void main(String args[]) {
    	
    }
}
// prior JAVA 7 it is possible to run java program without main method

/*Prior to Java 7, In java 7 and onword this is not possible

Yes, sequence is as follows:

1. jvm loads class
2. executes static blocks
3.looks for main method and invokes it
*/