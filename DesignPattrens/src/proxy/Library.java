package proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<String, EBook> ebooks = new HashMap<>();

    public void add(EBook book) {
        ebooks.put(book.getFileName(),book);
    }
    public void openEBook(String fileName){
        // deal with the null
        ebooks.get(fileName).show();
    }
}
