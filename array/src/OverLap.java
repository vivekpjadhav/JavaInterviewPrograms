public class OverLap {

    static int findPlatform(int arr[], int dep[]) {

        int n = arr.length;
        int result = 0;
        int i = 1, j = 0;
        int dist = Integer.MAX_VALUE;
        while (i < n) {
            dist = (arr[i] == arr[i - 1]) ? Math.min(dep[i-1], dep[i]) : dep[i-1];
            if (arr[i] != arr[i - 1]) {
                if (dist <= arr[i] - arr[i - 1])
                    result++;
            }
            i++;
            if (n == i && dep[n-1] != 0) {
                result++;
            }
        }
        return result;
    }
    // Driver program to test methods of graph class
    public static void main(String[] args) {

        //int arr[] = {1, 1, 1, 1, 4};
        //int dep[] = {10, 3, 6, 4, 2};
        int arr[] = {1,3,3,5,7};
        int dep[] = {2,2,6,2,2};
        int n = arr.length;
        System.out.println(findPlatform(arr, dep));
    }

}
