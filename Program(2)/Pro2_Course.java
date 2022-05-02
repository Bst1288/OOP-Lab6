import java.util.Scanner;

public class Pro2_Course{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter course name : ");
        String course = input.nextLine();
		System.out.print("Enter student #1 : ");
        String student1 = input.nextLine();
		System.out.print("Enter student #2 : ");
        String student2 = input.nextLine();
		System.out.print("Enter student #3 : ");
        String student3 = input.nextLine();
		// Add course name
		Course courseName = new Course(course);
		// Add three students
		courseName.addStudent(student1);
		courseName.addStudent(student2);
		courseName.addStudent(student3);
		// remove one student
		courseName.dropStudent(student2);
		// Displays
		System.out.println("----------------------------------------------------------");
		System.out.println("The students in the " + courseName.getCourseName() + " :");
		String[] students = courseName.getStudents();
		for (int i = 0; i < courseName.getNumOfStudent(); i++) {
			System.out.print(students[i] + " ");
		}
		System.out.printf("\n => and " + student2 + " isn't in the " + courseName.getCourseName() + " course");
		System.out.println(" ");
		System.out.println("----------------------------------------------------------");
		input.close();
    }
}