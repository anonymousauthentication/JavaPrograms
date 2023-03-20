package Java100Programs;

import java.util.ArrayList;

public class array {
	public static void main(String args[]) {
		int arr[] = {1 , 0, 2 , 5 ,0, 0 };
		ArrayList aa = new ArrayList();
		ArrayList bb = new ArrayList();
		int size = arr.length;
	   // System.out.println(size);
		for (int i = 0;i<=arr.length-1;i++)
		{
			if(arr[i]!=0  ) {
				aa.add(arr[i]);
			}
			else{
				bb.add(arr[i]);
			}
			
		}
		System.out.println(aa); 
		System.out.println(bb);
		System.out.println(aa.addAll(bb));
		System.out.println(aa);
	}
}

/*if(arr[i]!=0  ) {
	System.out.println(arr[i]);
}
if(arr[i] == 0 && arr[i-1]==0) {
	System.out.println(arr[i]);
	break;
}*/
