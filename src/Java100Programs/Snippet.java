package Java100Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snippet {
	public static void main(String args[]) {
	ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c"));
	ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("c", "d", "e"));
	List<String> listTwoCopy = new ArrayList<>(listTwo);
	listTwoCopy.removeAll(listOne);
	listOne.addAll(listTwoCopy);
	System.out.println(listOne);
	}
}

