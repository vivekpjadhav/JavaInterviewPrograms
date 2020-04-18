package generic;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class A  {
    int a ;

    public A() {
        this.a = a;
    }


}
class B extends A{
    int b ;

    public B(int b) {
        this.b = b;
    }
}
public class SuperTest <T>{
    static List<? extends B> list;
    public static void main(String[] args) {
         list = new ArrayList<B>();

    }


}
