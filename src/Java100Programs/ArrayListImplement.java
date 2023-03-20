package Java100Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImplement {
	public static void main(String args[]) {
		ArrayList obj = new ArrayList();
		obj.add(78);
		obj.add("Manohar");
		obj.add("Selenium WebDriver");
		obj.add('M');
		obj.add(12.36);
		obj.add(12.36);
		System.out.println("----Normal Print-----");
		System.out.println(obj);
		System.out.println("-----Enhanced For Loop-----");
		System.out.println(obj.contains('M')); 
		for(Object ee:obj) {
			System.out.println(ee);
		}
		System.out.println("----Iterator------");
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			Object value = itr.next();
			System.out.println(value);
		}
	}
}
