import org.example.Student;
import org.example.Teacher;
import org.junit.Test;

import java.util.ArrayList;

public class TestTeacher {

    @Test
    public void baseTestTeacher() {
        Teacher teacher = new Teacher("Tom", 30, "Computer Science", "Professor", new ArrayList<>());
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getDepartment());
        System.out.println(teacher.getPosition());
        Student student = new Student();
        student.setName("wjd");
        student.setID(0);
        System.out.print(student);
        teacher.getStudents().add(student);
        System.out.println(teacher.getStudents());
    }
}
