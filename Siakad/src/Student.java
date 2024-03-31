import java.util.ArrayList;

class Student extends Person {
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
    }

    public void printGrades() {
        System.out.println("Grades for " + getName() + ":");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i) + ": " + grades.get(i));
        }
    }
}
