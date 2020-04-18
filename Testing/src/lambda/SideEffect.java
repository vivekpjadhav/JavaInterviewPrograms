package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SideEffect {


    public static void main(String[] args) {
        int x = 0;

        Stream.of(1, 2, 4, 5, 6).map(n -> {
            // x++;   can modify inside
            return x * n; // this is work around
        });

        List<String> list = Arrays.asList("A", "AAAS", "BSADF");
        list.stream()
                .filter(k -> k.length() % 2 == 0).forEach(list::add);

        list.stream()
                .filter(k -> k.length() % 2 == 0).collect(Collectors.toList());

    }


}
