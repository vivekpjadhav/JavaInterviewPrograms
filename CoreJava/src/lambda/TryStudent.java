package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TryStudent {

    public static void main(String[] args) {
        List<Student> roster = new ArrayList<>();
        roster.addAll(Arrays.asList(
                new Student("vivek",72,2.5f),
                new Student("vivek2",72,3.5f),
                new Student("vivek3",52,3.5f),
                new Student("vivek4",80,2.5f),
                new Student("vivek5",62,2.8f)
        ));
        System.out.println(roster.toString());
//        roster.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getHight() -o2.getHight();
//            }
//        });

        roster.sort((a, b) ->
           a.getHight()-b.getHight()
        );

        roster.stream().forEach(System.out::print);
    }
}
