package lab3.repository;
import lab3.classes.Course;
import lab3.classes.Student;


import java.util.*;


public class StudentRepository implements ICrudRepository <Student> {

    public static List <Student> students;

    public StudentRepository() {
        students=new ArrayList<>();
    }

    public static List<Student> getStudents() {
        return students;
    }

    public static void setStudents(List<Student> students) {
        StudentRepository.students = students;
    }

    @Override
    public Student findOne(Long id) {
        for(Student s:students)
            if (s.getStudentid()==id)
                return s;
        return null;
    }

    @Override
    public Iterable<Student> findAll() {

        return students;
    }

    @Override
    public Student save(Student entity) {
        for(Student s: students)
            if(s.getStudentid()==(entity.getStudentid()))
                return  entity;
        return null;
    }

    @Override
    public Student delete(Long id) {
        Student studentdelete=null;
        int index = -1;
        for( int i=0; i<students.size(); i++) {
            if (students.get(i).getStudentid()==(id)) {
                studentdelete = students.get(i);
                index = i;
            }
        }


        if(index!=-1)
        {
            List <Student> StudentsArray;
            for(Course c: CourseRepository.getCourses()) {
                  StudentsArray = new ArrayList<Student>();
                  for(Student s:c.getStudentsEnrolled()) {
                      if(!(s.getStudentid()==(students.get(index).getStudentid())))
                          StudentsArray.add(s);
                  }
                  c.setStudentsEnrolled(StudentsArray);
              }
        }
        if(index!=-1)
            return students.get(index);
        students.remove(index);

        return null;
    }

    @Override
    public Student update(Student entity) {

        for(Student s:students){
            if(s.getStudentid()==entity.getStudentid()) {
                if (!(s.getStudentid()==s.getStudentid() ) )
                { System.out.print("The StudentsId can't be changed"); return entity;}
            }

            s.setFirstName(s.getFirstName());
            s.setLastName(s.getLastName());
            s.setTotalCredits(s.getTotalCredits());
        }
        return null;
    }
}
