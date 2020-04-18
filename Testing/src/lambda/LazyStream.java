package lambda;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LazyStream {

    private static int  multiplyByTwo(int n){

        System.out.println("multipy by two"+n);
        return n*2;

    }
     public void print(){
         Stream.of(new int[]{1,1,1,1,1,1}).mapToInt(n->n.length).forEach(System.out::print);
     }
    public static void main(String[] args) {
        int divBy3 = IntStream.range(100,200)
                .map(LazyStream::multiplyByTwo)
                .filter(n-> n % 3 ==0).findFirst().orElse(999);

        System.out.printf("First devisibel by 3 %d",divBy3);

        Stream.of(new int[]{1,1,1,1,1,1}).mapToInt(n->n.length).forEach(System.out::print);



    }
}
