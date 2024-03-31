import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data for Student
        System.out.println("Enter student's name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter student's address:");
        String studentAddress = scanner.nextLine();
        Student student = new Student(studentName, studentAddress);

        // Input data for Teacher
        System.out.println("Enter teacher's name:");
        String teacherName = scanner.nextLine();
        System.out.println("Enter teacher's address:");
        String teacherAddress = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        // Adding courses for Teacher
        System.out.println("Enter courses taught by the teacher (type 'done' to finish):");
        String course;
        while (!(course = scanner.nextLine()).equals("done")) {
            teacher.addCourse(course);
        }

        // Displaying courses taught by Teacher
        teacher.printCourses();

        // Simulating student selecting a course and getting grades
        System.out.println("Enter the course you want to enroll in:");
        String selectedCourse = scanner.nextLine();
        System.out.println("Enter your grade for " + selectedCourse + ":");
        int grade = scanner.nextInt();
        student.addCourseGrade(selectedCourse, grade);

        // Displaying student's grades
        student.printGrades();

        scanner.close();
    }
}
