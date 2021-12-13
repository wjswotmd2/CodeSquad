package This09;

import java.util.Objects;

public class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (studentName.equals(student.studentName)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentName.hashCode();
    }
}
