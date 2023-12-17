import java.util.ArrayList;

public class Student extends User {
    protected ArrayList<String> enrolledCourses;

    public Student(String name, int id) {
        super(name, id);
        enrolledCourses = new ArrayList<>();
    }

    @Override
    public String getUserDetail() {
        return super.getUserDetail();
        
    }

    public void enrollCourse(String course) {
        enrolledCourses.add(course);
    }

    public ArrayList<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }   
}