public class Attendance {

    static boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
        int aCount =0;
        int lCount =0;


        for(int i =0 ; i < arr.length ; i++){
            if(arr[i] == 'A'){
                aCount++;
            }else  if(arr[i] == 'L'){

                lCount = ((i <= arr.length-3) && (arr[i+1] =='L') && arr[i+2] =='L') ? lCount+=1 : lCount;

            }


        }

        System.out.printf("%s --- %s",aCount,lCount);
        if(aCount <=1 && lCount < 1)
            return true;
        else
            return false;

    }


    public static void main(String[] args) {

   //     System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));

    }
}
