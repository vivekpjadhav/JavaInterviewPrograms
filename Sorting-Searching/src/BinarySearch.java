public class BinarySearch {


static  int bSearch(int [] arr,int value){

    int start =0,end = arr.length-1;
     while(start <end){

         int mid  = (start+end) /2;
         if(arr[mid] == value){
             return arr[mid];
         } else if(arr[mid] < value){
             start = mid+1;
         }else if(arr[mid] > value){
             end = mid-1;
         }

     }
     return 0;
}
}
