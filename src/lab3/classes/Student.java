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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentid() == student.getStudentid() &&
                getTotalCredits() == student.getTotalCredits() &&
                getEnrolledCourses().equals(student.getEnrolledCourses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentid(), getTotalCredits(), getEnrolledCourses());
    }
}
