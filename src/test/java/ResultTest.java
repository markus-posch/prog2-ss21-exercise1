import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {
    @BeforeAll
    static void init() {}

    @BeforeEach
    void setUp(){}

    @Test
    @DisplayName("Method gradingStudents: Grades below 38")
    void testGradingsStudents_failed(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31, 32, 33, 34, 35, 36, 37));
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31, 32, 33, 34, 35, 36, 37);

        assertEquals(expected, actual,"Something went wrong with grades below 38");
    }
}
