import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
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
        List<Integer> actual = Result.gradingStudents(Arrays.asList(18, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31, 32, 33, 34, 35, 36, 37));
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31, 32, 33, 34, 35, 36, 37);
        assertEquals(expected, actual,"Something went wrong with grades below 38");
    }

    @Test
    @DisplayName("Method gradingStudents: Grades should round up")
    void testGradingsStudents_roundup(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(10,38,43,48,58,63,73,89,99,59,41));
        List<Integer> expected = Arrays.asList(40,45,50,60,65,75,90,100,60,41);
        assertEquals(expected, actual,"Grades didn't round up correctly");
    }
    @Test
    @DisplayName("Method gradingStudents: Grades should stay same")
    void testGradingsStudents_staysame(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(6,45,55,65,75,85,95));
        List<Integer> expected = Arrays.asList(45,55,65,75,85,95);
        assertEquals(expected, actual,"Grades should stay the same");
    }
    @Test
    @DisplayName("Method gradingStudents: Students == 0")
    void testGradingsStudents_numberStudents(){
        List<Integer> actual = Result.gradingStudents(Collections.singletonList(0));
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, actual,"Something went wrong with zero Students");
    }
    @Test
    @DisplayName("Method gradingStudents: Students but no grades")
    void testGradingsStudents_numberStudents2(){
        List<Integer> actual = Result.gradingStudents(Collections.singletonList(17));
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, actual,"There should be no grades in the List");
    }
}
