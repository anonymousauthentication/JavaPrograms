
public class ArrayDemo {
	public static void main(String args[]) {
		int student_id[] = new int[5];
		student_id[0] = (int) 21.21;
		student_id[1] = 22;
		student_id[2] = 23;
		student_id[3] = 24;
		student_id[4] = 25;
		int sizeOfArray = student_id.length;
		System.out.println("Student ID is "+student_id[0]);
		System.out.println("For Loop");
		for(int i = 0;i<sizeOfArray;i++) {
			System.out.println(student_id[i]);
		}
		System.out.println("While Loop");
		int index=0;
		int size = sizeOfArray;
		while(size>0) {
			System.out.println(student_id[index]);
			index++;
			size--;
		}
		System.out.println("Do While Loop");
		int id = 0;
		do {
			System.out.println(student_id[id]);
			id++;
			sizeOfArray--;
		}
		while(sizeOfArray>0);
	}
}
