package Java100Programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String args[]) {
		HashMap<String, String> obj1 = new HashMap<String, String>();
		obj1.put("200","Mukesh");
		obj1.put("250", "Sahi");
		obj1.put("400", "Selenium");
		obj1.put("500", "QTP");
		obj1.put("600", "Cypress");
		obj1.put("700", "Appium");
		obj1.put("800", null);
		obj1.put("900", null);
		System.out.println(obj1);
		String value = obj1.get("200");
		System.out.println("HashMap value = "+ value);
		for(Map.Entry<String, String> data : obj1.entrySet()) {
			System.out.println("Key from Map is "+data.getKey()+" and value is "+data.getValue());
		}
	}
}
