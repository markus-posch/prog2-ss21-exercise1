import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Github Repo Link:
https://github.com/markus-posch/prog2-ss21-exercise1
 */

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
    @DisplayName("Method gradingStudents: all Grades should round up")
    void testGradingsStudents_roundup(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(26,38,39,43,44,48,49,53,54,58,59,63,64,68,69,73,74,78,79,83,84,88,89,93,94,98,99));
        List<Integer> expected = Arrays.asList(40,40,45,45,50,50,55,55,60,60,65,65,70,70,75,75,80,80,85,85,90,90,95,95,100,100);
        assertEquals(expected, actual,"Grades didn't round up correctly");
    }
    @Test
    @DisplayName("Method gradingStudents: Grades should stay same")
    void testGradingsStudents_staysame(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(25,40,41,42,45,50,51,52,55,60,61,62,65,70,71,72,75,80,81,82,85,90,91,92,95,100));
        List<Integer> expected = Arrays.asList(40,41,42,45,50,51,52,55,60,61,62,65,70,71,72,75,80,81,82,85,90,91,92,95,100);
        assertEquals(expected, actual,"Grades should stay the same");
    }
    @Test
    @DisplayName("Method gradingStudents: Students == 0")
    void testGradingsStudents_numberStudents(){
        List<Integer> actual = Result.gradingStudents(Collections.singletonList(0));
        List<Integer> expected = null;
        assertEquals(expected, actual,"Something went wrong with zero Students");
    }
    @Test
    @DisplayName("Method gradingStudents: Students but no grades")
    void testGradingsStudents_numberStudents2(){
        List<Integer> actual = Result.gradingStudents(Collections.singletonList(17));
        List<Integer> expected = null;
        assertEquals(expected, actual,"There should be no grades in the List");
    }
    @Test
    @DisplayName("Method gradingStudents: 60 Students")
    void testGradingsStudents_ArrayNull(){
        List<Integer> actual = Result.gradingStudents(null);
        List<Integer> expected = null;
        assertEquals(expected, actual,"List schould not be null");
    }
    @Test
    @DisplayName("Method gradingStudents: 1 Student")
    void testGradingsStudents_SingeStudent(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(1,73));
        List<Integer> expected = Arrays.asList(75);
        assertEquals(expected, actual,"Please check your minimum of Students");
    }
    @Test
    @DisplayName("Method gradingStudents: More than 60 Students")
    void testGradingsStudents_StudentsAboveLimit(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(65));
        List<Integer> expected = null;
        assertEquals(expected, actual,"Check your implementation of maximum Students");
    }
    @Test
    @DisplayName("Method gradingStudents: More Students than grades")
    void testGradingsStudents_StudentsGrades(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(40,15,34));
        List<Integer> expected = null;
        assertEquals(expected, actual,"There are more Students than grades in List");
    }

    @Test
    @DisplayName("Method gradingStudents: Grade out of Range 0 - 100")
    void testGradingsStudents_GradesRange(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(5,20,44,150,-25,60));
        List<Integer> expected = Arrays.asList(20,45,null,null,60);
        assertEquals(expected, actual,"Check your implementation for Grades not between 0-100");
    }
}
