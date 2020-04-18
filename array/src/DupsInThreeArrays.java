import java.util.ArrayList;
import java.util.List;

public class DupsInThreeArrays {

    public static void main(String[] args) {

    }
    static int[] findDuplicates(int[] arr1, int[] arr2) {
        // your code goes here

        int p1 = 0;
        int p2 = 0;

        List<Integer> duplicates = new ArrayList<>();

        while (p1 < arr1.length && p2 < arr2.length) {

            if (arr1[p1] > arr2[p2]) {
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                // duplicates
                duplicates.add(arr1[p1]);

                p1++;
                p2++;
            }

        }

        int [] answer = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++)
            answer[i] = duplicates.get(i);

        return answer;
    }




    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {

        List<Integer> result = new ArrayList<>();
        int i = 0,j = 0,k=0;
        while (i< arr1.length && j< arr2.length && k < arr3.length) {

            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                System.out.println(arr1[i]);
                result.add(arr1[i]);
                i++;j++;k++;
            }else if(arr1[i] < arr2[j])
                i++;
            else if(arr2[j] < arr3[k])
                j++;
            else
                k++;



        }


        return result;

    }

}
