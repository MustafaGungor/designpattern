package designpattern.com.mg.pattern.other.dataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Mustafa",0);
        Student student2 = new Student("Büşra",1);
        students.add(student1);
        students.add(student2);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(Student student) {
        students.get(student.getRolNo()).setName(student.getName());
        System.out.println("Rol Nosu "+ student.getRolNo() + " olan kayıt güncellenmiştir.");
    }

    public void deleteStudent(Student student) {
        students.remove(student.getRolNo());
        System.out.println("Rol Nosu "+ student.getRolNo() + " olan kayıt silinmiştir.");
    }
}
