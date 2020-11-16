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
        Course course_to_delete = null;
        int index = -1;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseid() == (id)) {
                course_to_delete = courses.get(i);
                index = i;
            }
        }


        if (index != -1) {
            courses.remove(index);
            List<Teacher> TeachersArray;
            List<Student> StudentArray;

            for (Teacher t : TeacherRepository.getTeachers()) { //mergem prin teachers
                TeachersArray = new ArrayList<Teacher>();
                if (!(t.getCourses().equals(id))) {  //cautam cursul cu id ul dat ca parametru
                    TeachersArray.add(t);
                }
                for (Student s : StudentRepository.getStudents()) { //mergem prin studentss
                    StudentArray = new ArrayList<Student>();
                    if (!(s.getEnrolledCourses().equals(id))) {  //cautam cursul cu id ul dat ca parametru
                        StudentArray.add(s);
                    }

                }
                if (index != -1)
                    return courses.get(index);
                courses.remove(index);

            }
        }
        return null;
    }

            @Override
            public Course update (Course entity){

                for(Course c:courses){
                    if(c.getCourseid()==entity.getCourseid()) {
                        if (!(c.getCourseid()==c.getCourseid() ) )
                        { System.out.print("The StudentsId can't be changed"); return entity;}
                    }

                    c.setTeacher(c.getTeacher());
                    c.setStudentsEnrolled(c.getStudentsEnrolled());
                }
                return null;
            }
        }
