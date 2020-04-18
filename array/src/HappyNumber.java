public class HappyNumber {

    public static  boolean isHappy(int n) {
        while (true) {
            if(n == 1 || n == 7)
                return true;
            if(n<10)
                return false;
            int sum = 0;
            while(n!=0){
                int digit = n%10;
                sum += digit * digit;
                n = n/10;
            }
            return (sum==1)?true: isHappy(sum);
        }

    }

    private int sumOfSquaresOfDigits(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum += digit * digit;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.print(isHappy(401));
    }
}

