package lab3.repository;

import lab3.classes.Course;
import lab3.classes.Student;
import lab3.classes.Teacher;


import java.util.ArrayList;
import java.util.List;

public class CourseRepository  implements ICrudRepository <Course>  {
    public static List<Course> courses;

    public CourseRepository() {
        courses=new ArrayList<>();
    }

    public static List<Course> getCourses() {
        return courses;
    }

    public static void setCourses(List<Course> courses) {
        CourseRepository.courses = courses;
    }

    @Override
    public Course findOne(Long id) {
        for(Course c: courses)
            if (c.getCourseid()==id)
                return c;
        return null;
    }

    @Override
    public Iterable<Course> findAll() {
        return courses;
    }

    @Override
    public Course save(Course entity) {
        for(Course c:courses)
            if(c.getCourseid()==entity.getCourseid())
                return entity;
        return null;
    }

    @Override
    public Course delete(Long id) {
        return null;
    }

    @Override
    public Course update(Course entity) {
        return null;
    }
}
