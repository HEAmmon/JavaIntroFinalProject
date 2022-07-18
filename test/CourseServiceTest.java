import com.generation.model.Course;
import com.generation.model.Module;
import com.generation.model.Student;
import com.generation.service.CourseService;
import com.generation.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseServiceTest {

        CourseService courseService;
        @BeforeEach
        void setUp() {
            courseService = new CourseService();
        }

        @Test
        void getCourse(String code) {
            code = "JS-INTRO-1";
            assertEquals("JS-INTRO-1", getCourse(code);
        }

        @Test
        void registerCourse(Course course) {
            Module module = new Module( "JS-INTRO", "Intro to JS", "Intro module for JS");
            course = new Course( "JS-INTRO-1", "JS", 3, module);
            assertEquals(("JS-INTRO-1", "JS", 3, module), registerCourse(course));
        }


    }

