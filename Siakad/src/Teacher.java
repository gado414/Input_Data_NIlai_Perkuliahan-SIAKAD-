import java.util.ArrayList;

class Teacher extends Person {
    private ArrayList<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void printCourses() {
        System.out.println("Courses taught by " + getName() + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}
