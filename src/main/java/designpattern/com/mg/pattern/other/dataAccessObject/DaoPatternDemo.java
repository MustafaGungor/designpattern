package designpattern.com.mg.pattern.other.dataAccessObject;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        for (Student student: studentDao.getAllStudents()){
            System.out.println("Student : RolNo : "+ student.getRolNo() + " Name: "+ student.getName());
        }

        Student student = studentDao.getAllStudents().get(0);
        student.setName("Erdal");
        studentDao.updateStudent(student);

        studentDao.getStudent(0);
        System.out.println("Student : RolNo : "+ student.getRolNo() + " Name: "+ student.getName());

    }
}
