public class SquarRoot {

    static int root(int n){
        if(n <2) return n;

        int left = (int)Math.pow(Math.E,0.5 * Math.log(n));
        int rigth = left+1;
        return rigth*left  > n? left:rigth;
    }

    public static void main(String[] args) {
        System.out.println(root(9));
    }

}
