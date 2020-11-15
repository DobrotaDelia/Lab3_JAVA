package lab3.classes;

import java.util.*;
public class Teacher extends  Person{

    private List <Course> courses;

    public Teacher(List<Course> courses, String lastName, String firstName) {
        super(lastName, firstName);
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "courses=" + courses +
                '}';
    }
}
