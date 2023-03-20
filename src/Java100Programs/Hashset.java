package Java100Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {
	public static void main(String args[]) {
		HashSet<String> values = new HashSet<String>();
	    values.add("Selenium");
	    values.add("Cypress");
	    values.add("QTP");
	    values.add("Appium");
	    values.add("Appium");
	    System.out.println(values);
	    
	    LinkedHashSet<String> values2 = new LinkedHashSet<String>();
	    values2.add("Selenium");
	    values2.add("Cypress");
	    values2.add("QTP");
	    values2.add("Appium");
	    values2.add("Appium");
	    System.out.println(values2);
	    
	    TreeSet<String> values3 = new TreeSet<String>();
	    values3.add("Selenium");
	    values3.add("Cypress");
	    values3.add("QTP");
	    values3.add("Lambda");
	    values3.add("Appium");
	    values3.add("Appium");
	    System.out.println(values3);
	    
	    ArrayList<String> val= new ArrayList<String>(values2);
	    System.out.println(val.get(1));
	}
}
