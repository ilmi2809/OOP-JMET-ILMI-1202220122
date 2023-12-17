import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        int studentId = 0;
        boolean validId = false;

        while (!validId) {
            try {
                System.out.print("Enter Student Id: ");
                studentId = scanner.nextInt();
                validId = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for the ID.");
                scanner.nextLine();
            }
        }

        Student student = new Student(studentName, studentId);
        students.add(student);

        System.out.println("Enter courses to enroll in (separated by commas): ");
        scanner.nextLine();
        String coursesInput = scanner.nextLine();
        String[] courseNames = coursesInput.split(", ");

        for (String courseName : courseNames) {
            student.enrollCourse(courseName);
        }

        ArrayList<String> course101Students = new ArrayList<>();
        course101Students.add("Haris");
        course101Students.add("Metta");

        ArrayList<String> course102Students = new ArrayList<>();
        course102Students.add("Windy");
        course102Students.add("Amilia");

        System.out.println("\nCourse ID: 101,");
        System.out.println("Course Name: Pemrograman Berbasis Objek");
        for (String studentInCourse : course101Students) {
            System.out.println("- Student: " + studentInCourse);
        }

        System.out.println("\nCourse ID: 102,");
        System.out.println("Course Name: Statistika Industri");
        for (String studentInCourse : course102Students) {
            System.out.println("- Student: " + studentInCourse);
        }
        
        for (Student enrolledStudent : students) {
            System.out.println("\nStudent - Name : " + studentName + ", ID: " + studentId + ",");
            System.out.println("Enrolled Courses: " + coursesInput);
        }

        Teacher yoga = new Teacher("Pak Yoga", 2001);
        Admin hudza = new Admin("Hudza", 3001);

        yoga.teachClass("Permodelan Proses Bisnis");
        hudza.manageSystem("University");

        scanner.close();
    }
}