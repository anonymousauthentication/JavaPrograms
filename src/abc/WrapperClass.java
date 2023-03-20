package abc;

import java.util.ArrayList;
import java.util.stream.Stream;

public class WrapperClass {
	public static void main(String args[]) {
		ArrayList<Integer> aa = new ArrayList<Integer>();
		aa.add(2);
		aa.add(4);
		System.out.println(aa);
		aa.remove(0);
		System.out.println(aa);
		Stream<Integer> aaa = aa.stream();

		int a = 10;
		String s = "45";
		int b = Integer.parseInt(s);
		System.out.println(b);
		String ss = Integer.toString(a);
		System.out.println(ss);
		System.out.println(b + ss + a);
		int first = 4;
		// autoboxing
		Integer second = first;
		// boxing
		Integer d = Integer.valueOf(first);
		// unboxing
		Integer result = 100;
		int newResult = result.intValue();
		// autounboxing
		int v = result;
	}
}
