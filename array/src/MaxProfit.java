public class MaxProfit {

    public static int maxProfit1(int prices[]) {
        int profit =0;
        int min = Integer.MAX_VALUE;

        for(int i =0 ; i < prices.length ;i++ ){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i]-min);
        }

        return profit ;
    }


    public static int maxSubArray(int arr[]) {
        //contugince array
        
        int max = arr[0];
        int curr_max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            curr_max = Math.max(arr[i],curr_max+arr[i]);
            System.out.println("curr_max "+curr_max);
            max = Math.max(max,curr_max);
            System.out.println(max);
        }
        return max;
    }


    public static void main(String[] args) {
        int price[] = { 1,2,3,4,5 };
        int priceX[] = { 7,1,5,3,6,4 };



        int n = price.length;
        System.out.println(maxProfit1(price));
        System.out.print(maxProfit1(priceX));
//        System.out.print(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
//        System.out.print(maxSubArray(new int[]{-2,1}));


    }

}
