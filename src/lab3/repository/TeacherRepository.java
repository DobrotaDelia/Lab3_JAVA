package lab3.repository;

import lab3.classes.Course;
import lab3.classes.Student;
import lab3.classes.Teacher;
import java.util.*;


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
        return null;
    }

    @Override
    public Teacher delete(Long id) {
        Teacher teacher_to_delete=null;
        int index = -1;
        for( int i=0; i<teachers.size(); i++) {
            if (teachers.get(i).getTeacherid()==(id)) {
                teacher_to_delete = teachers.get(i);
                index = i;
            }
        }
        if(index!=-1)
        {
            List <Teacher> TeachersArray;
            for(Teacher t:TeacherRepository.getTeachers()) {
                TeachersArray = new ArrayList<Teacher>();
                if(!(t.getTeacherid()==(teachers.get(index).getTeacherid())))
                        TeachersArray.add(t);
                //t.setTeachers

            }
        }
        if(index!=-1)
            return teachers.get(index);
        teachers.remove(index);

        return null;
    }

    @Override
    public Teacher update(Teacher entity) {
        return null;
    }
}
