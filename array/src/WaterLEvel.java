public class WaterLEvel {

    static int maxArea(int[] arr) {

        int n = arr.length;
        int j = n-1;
        int i = 0;
        int water = Integer.MIN_VALUE;
        while( i < j){
            int min =  Math.min(arr[i],arr[j]);
            int diff = j-i;
            water = Math.max(water,min*diff);
            if(arr[i] < arr[j])
                i++;
            else
                j--;
        }
        return water;

    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1 ,8, 6 ,2 ,5 ,4, 8, 3, 7}));
    }
}
