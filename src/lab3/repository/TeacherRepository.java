package lab3.repository;
import lab3.classes.Course;
import lab3.classes.Student;
import lab3.classes.Teacher;
import java.util.*;

//class with ICRudRepository interface
public class TeacherRepository implements ICrudRepository<Teacher> {
    public  static List <Teacher> teachers;

    public TeacherRepository() {teachers=new ArrayList<>();
    }

    public static List<Teacher> getTeachers() {
        return teachers;
    }

    public static void setTeachers(List<Teacher> teachers) {
        TeacherRepository.teachers = teachers;
    }

    @Override
    public Teacher findOne(Long id) {
        for(Teacher t: teachers)
        if (t.getTeacherid()==id)
            return t;
        return null;
    }

    @Override
    public Iterable<Teacher> findAll() {
        return teachers;
    }

    @Override
    public Teacher save(Teacher entity) {
        for(Teacher t:teachers)
            if(t.getTeacherid()==entity.getTeacherid())
                return entity;
       // teachers.add(entity);
        return null;
    }

    @Override
    public Teacher delete(Long id) {
        Teacher teacher_to_delete=null;
        int index = -1;
        for( int i=0; i<teachers.size(); i++) {  //we parse through the teachers list
            if (teachers.get(i).getTeacherid()==(id)) { //we search for the teacher with the id given as a parameter
                teacher_to_delete = teachers.get(i);   //the teacher we want to delete
                index = i;  //the index of the teacher we want to delete
            }
        }
        //we found a teacher
        if(index!=-1)

        {

            List <Teacher> TeachersArray;
            for(Course c:CourseRepository.getCourses()){ //removing the teacher from a all the courses
                TeachersArray = new ArrayList<Teacher>();
                if(!(c.getTeacher().equals(id))){
                    TeachersArray.add(c.getTeacher());
                }
            }

        }

        if(index!=-1)
            return teachers.get(index);
        teachers.remove(index); //removing the teacher from TeacherRepositorys list: techers

        return null;
    }

    @Override
    public Teacher update(Teacher entity) {
        for(Teacher t:teachers){
            if(t.getTeacherid()==entity.getTeacherid()) {
                if (!(t.getTeacherid()==t.getTeacherid() ) )
                { System.out.print("The TeachersId can't be changed"); return entity;}
            }

            t.setFirstName(t.getFirstName());
            t.setLastName(t.getLastName());
            t.setCourses(t.getCourses());
        }
        return null;
    }
}
