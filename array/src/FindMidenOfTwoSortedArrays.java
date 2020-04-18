public class FindMidenOfTwoSortedArrays {


    public static double findMedianSortedArrays(int[] arr1,int[]arr2){
        if(arr1.length >arr2.length){
            return findMedianSortedArrays(arr2,arr1);
        }
        int x = arr1.length;
        int y = arr2.length;
        int low =0 ,high=x;

        while(low <= high){

            /**
             *  [1, 3, 8],[ 9, 15]  X
             *  [7, 11, 19],[ 21, 18, 25] Y
             *[1,3,7,8,9,11,15,
             *  px = x+y) /2
             *  py = (x+y+1)/2 -px
             *
             */
            int px = (low+high)/2;
            int py = (x+y+1)/2 -px;

            int maxLX =(px ==0) ? Integer.MIN_VALUE : arr1[px -1];
            int minRX = (px == x ) ? Integer.MAX_VALUE :arr1[px];
            int maxLY =(px ==0) ? Integer.MIN_VALUE : arr2[py -1];
            int minRY = (px == x ) ? Integer.MAX_VALUE :arr2[py];
            if(maxLX <= minRY  && maxLY <= minRX ){

                if((x+y)%2 == 0){
                    return (Math.max(maxLX,maxLY) + Math.max(minRX,minRY))/2;
                }else
                    return Math.max(maxLX,maxLY);

            }  else if( maxLX > minRY){
                high = px -1;
            }  else{
                low = px +1;
            }


        }
        throw  new IllegalArgumentException();

    }

    public static void main(String[] args) {
        int[] x = {1, 3, 8, 9, 15};
        int[] y = {7, 11, 19, 21, 18, 25};

        System.out.println( findMedianSortedArrays(x, y));
    }

}
