package comparator;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Name {
    String first, last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getLast() {
        return last;
    }

    public String getFirst() {
        return first;
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}

public class TestComparator {

    public static void main(String[] args) {
        ArrayList<Name> list = new ArrayList<>(Arrays.asList(
                new Name("abhi", "jadhav"),
                new Name("arya", "dadhav"),
                new Name("rupa", "badhav"),
                new Name("raghu", "zadhav"),
                new Name("vivek", "gadhav")
        ));
        Comparator<Name> byLast = (a, b)
                -> a.getLast().compareTo(b.getLast());
        Comparator<Name> byFirst = (a, b)
                -> a.getFirst().compareTo(b.getFirst());
        list.sort(byFirst.thenComparing(byLast));
       // list.sort(byLast);
        list.forEach(System.out::println);

    }


}
