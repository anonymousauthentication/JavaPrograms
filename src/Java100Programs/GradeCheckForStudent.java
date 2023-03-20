package Java100Programs;

import java.util.Scanner;

public class GradeCheckForStudent {
	public static void main(String args[]) {
		int markobtained, passingMark;
		passingMark = 40;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mark Obtained by You");
		markobtained = sc.nextInt();
		if (markobtained > passingMark) {
			if (markobtained > 90) {
				grade = 'A';
			} else if (markobtained > 75) {
				grade = 'B';
			} else 
				grade = 'C';
			System.out.println("You pass the Exam and Grade is " + grade);
			
		} else {
			grade = 'F';
		System.out.println("You Failed the Exam and Grade is " + grade);
		}
	}
}
