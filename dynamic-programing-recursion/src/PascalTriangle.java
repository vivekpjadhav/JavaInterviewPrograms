import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PascalTriangle {

  static List<Integer> getRows(int rows){
      List<Integer> result = new ArrayList<>();

      for (int i = 0; i <= rows ; i++) {
          result.add(getNum(rows,i));

      }

      return result;
  }

    static int getNum(int row,int col){
      if(row ==0 || col ==0 || row==col){
          return 1;
      }

      return getNum(row-1,col-1) + getNum(row-1,col);
    }

    public static void main(String[] args) {
        Stream.of(getRows(4)).forEach(System.out::println);
    }
}
