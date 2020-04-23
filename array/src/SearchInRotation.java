public class SearchInRotation {


        public int search(int[] arr, int target) {

            int pivot = getPivot(arr,0,arr.length-1);


            if(pivot ==-1 )
                return bsearch(arr,target,0,arr.length-1);

            if(target == arr[pivot]) return pivot;

            if( target >= arr[0])
                return bsearch(arr,target,0,pivot-1);
            else
                return bsearch(arr,target,pivot+1,arr.length-1);

        }

    public int bsearch(int[] arr, int key , int l,int r){

        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == key)
                return mid;
            else if(arr[mid] < key)
                l= mid+1;
            else if(arr[mid] > key)
                r=mid-1;

        }
        return -1;


    }


    public int getPivot(int[] arr ,int s,int e) {
        if (e < s) return -1;
        if (e == s) return s;
        int mid = (s + e) / 2;

        while (true) {


                if (mid > s && arr[mid] < arr[mid - 1])
                    mid -= 1;
                else if (mid < e && arr[mid] > arr[mid + 1])
                    mid += 1;
                else break;
            }



        return -1;
    }


        public static void main (String args[])
        {
            SearchInRotation s = new SearchInRotation();
            // Let us search 3 in below array
            int arr1[] = {1, 3};
            int n = arr1.length;
            int key = 0;
            System.out.println("Index of the element is : "
                    + s.search(arr1, key));
        }

    }
