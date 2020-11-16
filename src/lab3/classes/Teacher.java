package lab3.classes;
import java.util.*;

//class Teacher is a subclass of class Person
public class Teacher extends  Person{

    private int teacherid;
    private List <Course> courses;

    //constructor with parameters
    public Teacher(int teacherid, List<Course> courses, String lastName, String firstName) {
        super(lastName, firstName);
        this.teacherid=teacherid;
        this.courses = courses;
    }

    //Getters and Setters
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
