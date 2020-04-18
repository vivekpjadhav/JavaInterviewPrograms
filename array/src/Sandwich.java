import javax.swing.*;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

/*
 * Given an array of numbers representing the food someone has eaten during the day. A special number is 1.
 * 1 represents bread, any food in between two 1s, means the person had a sandwich. Going through the list, print how many sandwiches the person has eaten.

For example:
Input - 2,3,56,76,45,435,1,34554,454,1,456,1,554566
Output - 1 sandwich

Input - 1,456435,2556,54,1,24355,1,5345,553,1,55354
Output - 2 sandwich

Input - 1,456435,2556,54,1,24355,1,5345,553,1,1,1,55354,1
Output - 3 sandwich

int[] val = new int[]{2,3,56,76,45,435,1,34554,454,1,456,1,554566};
 */

class Sandwich{


    static int getSandwichs(int[] data){

        int n = data.length;
        int breadCount =0;
        int foodCount =0;


        for(int i =0 ; i < n ; i++){
            if(data[i] == 1  ){
                // bread count
                breadCount = (i >0 && data[i-1] == 1 ) ?breadCount:breadCount+1;
                if(breadCount==2) {
                    foodCount++;
                    breadCount =0;
                }
            }
        }
        return foodCount;

    }

    public static void main(String... arrrrrgs) {


    }
}