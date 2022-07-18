import com.generation.model.Student;
import com.generation.model.Course;
import com.generation.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentServiceTest {

        StudentService studentService;
        @BeforeEach
        void setUp() {
            studentService = new StudentService();
        }

        @Test
        void findStudent(String studentId) {
            Student student = new Student("1234", "Bob", "bob@email.com", 07-08-1999);
            assertEquals("1234", studentService.findStudent(studentId));
        }

        @Test
        void subscribeStudent(Student student) {
            student = new Student("1234", "Bob", "bob@email.com", 07-08-1999);
            assertEquals(studentService.getStudents(), studentService.subscribeStudent()); // area = pi(r)^2
        }


    }
