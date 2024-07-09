import org.example.Student;
import org.junit.Test;

public class TestStudent {
    @Test
    public void baseTest() {
        Student student = new Student();
        student.setName("wjd");
        student.setID(0);
        System.out.print(student);
    }
}
