package lab3.controller;
import java.util.*;
import lab3.classes.Course;
import lab3.classes.Student;
import lab3.repository.CourseRepository;
import lab3.repository.StudentRepository;

public class RegistrationSystem {

    /**
     *
     * @param student
     * @param course
     * @return boool value
     */
    public boolean register(Student student, Course course){

       for(Student s:StudentRepository.getStudents())  //mergem prin lista de studenti
           if(s.getStudentid()==student.getStudentid()) //cautam student
               for(Course c:s.getEnrolledCourses())   //cautam in lista de enrolledCourses a studentului course-ul
                   if(c==course)
                       return true;

       return false;
    }

    /**
     *
     * @return List of Courses with free places
     */
    public List<Course> retrieveCoursesWithFreePlaces(){
        List<Course> FreePlaces  = new ArrayList<Course>();
        for(Course c:CourseRepository.getCourses()){
            if(c.getStudentsEnrolled().size() <c.getMaxEnrollment())
                FreePlaces.add(c);
        }
        return FreePlaces;
    }

    /**
     *
     * @param course
     * @return List of students enrolled at a course
     */
    public List<Student> retrieveStudentsEnrolledForACourse(Course course){
        List<Student> EnrolledStudents  = new ArrayList<Student>();
        for(Course c:CourseRepository.getCourses())
            if(c==course)
                EnrolledStudents.addAll(c.getStudentsEnrolled());
        return EnrolledStudents;

    }

    /**
     *
     * @return List of all courses
     */
    public List<Course> getallCourses(){
        List<Course> ListCourses  = new ArrayList<Course>();
        for(Course c: CourseRepository.getCourses())
            ListCourses.add(c);
        return  ListCourses;
    }
}
