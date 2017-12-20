package Chapter6;
import java.util.Scanner;

public class ScholarshipGiver {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();

		System.out.print("How many tests to report? ");
		int tests = scanner.nextInt();

		System.out.println("For Student 1...");
		studentInput(s1, tests);
		System.out.println("For Student 2...");
		studentInput(s2, tests);

		if (s1.getAverage() > s2.getAverage()){
			System.out.println(s1.getName() + " gets the scholarship.");
		} else if (s2.getAverage() > s1.getAverage()) {
			System.out.println(s2.getName() + " gets the scholarship.");
		} else {
			System.out.println("The students are equal, just choose based on race or something. :P");
		}


	}

	public static void studentInput(Student student, int testNum){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Student Name: ");
		student.setName(scanner.nextLine());

		for (int i = 1; i <= testNum; i++) {
			System.out.print("Test " + i + ": ");
			student.setScore(i, scanner.nextInt());
		}
		System.out.println();
	}
}
