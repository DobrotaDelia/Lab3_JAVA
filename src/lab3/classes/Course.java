package lab3.classes;
import java.util.*;

public class Course {
    private int courseid;
    private String name;
    private Teacher teacher;
    private int maxEnrollment;
    private int credits;
    private List <Student> studentsEnrolled;

    //constructor with parameter
    public Course(int courseid, String name, Teacher teacher, int maxEnrollment, int credits, List<Student> studentsEnrolled) {
        this.courseid=courseid;
        this.name = name;
        this.teacher = teacher;
        this.maxEnrollment = maxEnrollment;
        this.credits = credits;
        this.studentsEnrolled = studentsEnrolled;
    }


    //Getters and Setters for the attributes:
    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public int getCredits() {
        return credits;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setStudentsEnrolled(List<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", maxEnrollment=" + maxEnrollment +
                ", credits=" + credits +
                ", studentsEnrolled=" + studentsEnrolled +
                '}';
    }
}
