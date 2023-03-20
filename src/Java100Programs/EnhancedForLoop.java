package Java100Programs;

public class EnhancedForLoop {
 public static void main(String args[]) {
	 int prime[] = {1,2,3,5,7,11};
        for (int a:prime) {
        	if(a==5)
        	{
        		continue;
        	}
        	else {
        	System.out.println(a);
        	}
        }
 }
}
