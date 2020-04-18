package decorator;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

class Camera {
    Function<Color,Color> filter;

    public Camera(Function<Color, Color> ... filters) {
//        filter = input->input;
//
//        for (Function<Color,Color> aFilter:filters) {
//            filter.andThen(aFilter);
//
//        }

      //  filter = Stream.of(filters).reduce(input->input ,(aFilter,result) ->result.andThen(aFilter));
        filter = Stream.of(filters).reduce(input->input ,Function::andThen);
    }

    public Color snap(Color input) {
        return filter.apply(input);
    }

}

public class DecoWithLambda {
//    public static void printIt(int n, String msg, Function<Integer, Integer> fun) {
//        System.out.println(n + " " + msg + " " + " " + fun.apply(n));
//    }

    public static void printCol(Camera camera) {
        System.out.println(camera.snap(new Color(125,125,125)));

    }

    public static void main(String[] args) {
       /* Function<Integer, Integer> doubled = e -> e * 2;
        Function<Integer, Integer> inc = e -> e + 1;
        printIt(2, "vivek' add ", inc.andThen(doubled).andThen(inc).andThen(doubled));*/

       printCol(new Camera());
       printCol(new Camera(Color::darker));
       printCol(new Camera(Color::brighter));
    }

}
