package lab3.classes;

import java.util.*;
public class Teacher extends  Person{

    private int teacherid;
    private List <Course> courses;

    public Teacher(int teacherid, List<Course> courses, String lastName, String firstName) {
        super(lastName, firstName);
        this.teacherid=teacherid;
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "courses=" + courses +
                '}';
    }
}
