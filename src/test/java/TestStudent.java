import org.example.Student;
import org.junit.Test;

public class TestStudent {
    @Test
    public void baseTestStudent() {
        Student student = new Student();
        student.setName("wjd");
        student.setID(0);
        System.out.print(student);
    }
}
