package lab3.classes;

import java.util.*;

public class Student extends  Person {

    private long studentid;
    private int totalCredits;
    private List<Course> enrolledCourses;

    public Student(long studentid, int totalCredits, List<Course> enrolledCourses, String firstName,String lastName) {
        super(lastName, firstName);
        this.studentid = studentid;
        this.totalCredits = totalCredits;
        this.enrolledCourses = enrolledCourses;
    }

    public long getStudentid() {
        return studentid;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setStudentid(long studentid) {
        this.studentid = studentid;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", totalCredits=" + totalCredits +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }
}
