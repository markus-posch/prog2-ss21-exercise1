import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> gradesrounded = new ArrayList<>();
        if(grades != null) {
            if (grades.get(0) >= 1 && grades.get(0) <= 60 && grades.size() > 1) {
                int i = 1;
                while (i <= grades.get(0)) {
                    if (grades.get(i) >= 0 && grades.get(i) <= 100) {
                        if (grades.get(i) < 38) {
                            gradesrounded.add(grades.get(i));
                        } else if ((grades.get(i) % 5) == 0) {
                            gradesrounded.add(grades.get(i));
                        } else if (grades.get(i) % 5 == 3) {
                            int newgrade = grades.get(i) + 2;
                            gradesrounded.add(newgrade);
                        } else if (grades.get(i) % 5 == 4) {
                            int newgrade = grades.get(i) + 1;
                            gradesrounded.add(newgrade);
                        } else {
                            gradesrounded.add(grades.get(i));
                        }
                        i++;
                    } else {
                        System.out.println("Grade not in 0 to 100");
                    }
                }
            } else {
                System.out.println("Number of Students incorrect");
            }
        }
        else {
            gradesrounded = null;
        }

        return gradesrounded;

    }
}
