import java.util.List;

public class Classroom {
    String classroomName;
    String teacherName;
    List students;

    // class constructor

    Classroom (
            String classroomName,
            String teacherName,
            List students
    ) {
        this.classroomName = classroomName;
        this.teacherName = teacherName;
        this.students = students;
    }

    //addStudentToClass method
    public  List addStudentToClass(String studentName) {

        this.students.add(studentName);
        return this.students;
    }

    //removeStudentFromClass method
    public  List removeStudentFromClass ( String studentName) {
        if (!this.students.contains(studentName)) {

        }
        this.students.remove(studentName);
        return this.students;
    }

    //return number of students in a class
     public int getNumberOfStudents () {
        return this.students.size();
     };

    // Check if a student is enrolled in a class

    public boolean isStudentEnrolled ( String studentName) {
        return students.contains(studentName);
    };

}
