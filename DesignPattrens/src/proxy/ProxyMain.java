package proxy;

import java.util.stream.Stream;

public class ProxyMain {

    public static void main(String[] args) {
        Library library = new Library();

        String[] filenames = new String[]{"a","b","c"};

        for (String s:filenames ) {
            library.add(new EBookProxy(s));

        }
        library.openEBook("a");
    }
}
