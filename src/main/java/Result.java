import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> gradesrounded = new ArrayList<>();
        for(Integer grade : grades) {
            if (grade < 38) {
                gradesrounded.add(grade);
            }
            else if ((grade%5) == 0){
                gradesrounded.add(grade);
            }
            else if (grade % 5 > 3){
                int newgrade = (grade%5) +1;
                gradesrounded.add(newgrade);
            }

            else {
                gradesrounded.add(grade);
            }
        }

        return gradesrounded;

    }
        }
        return gradesrounded;
    }
}
