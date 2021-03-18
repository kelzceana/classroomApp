import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] arg) {
     Classroom classroomOne = new Classroom(
             "Maths",
             "Victor",
              new ArrayList()
     );
     classroomOne.addStudentToClass("Kelechi");
        classroomOne.addStudentToClass("Monica");
        System.out.println(classroomOne.isStudentEnrolled("Kelechi"));
    }

}
