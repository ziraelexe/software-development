import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeListTest {

    private GradeList gradeList;

    @BeforeEach
    public void setUp() {
        gradeList = new GradeList();
    }

    @Test
    public void testAddStudent() {

        Student student = new Student("John", 12, 3);
        gradeList.addStudent(student);

    }
}
