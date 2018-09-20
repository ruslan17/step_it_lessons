package interfaces.humans;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return student.getGrants() - t1.getGrants();
    }
}
