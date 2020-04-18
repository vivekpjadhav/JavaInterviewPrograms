package lambda;

import lambda.Student;

import java.util.Comparator;

public class StudentHightComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getHight()-o2.getHight();
    }
}
