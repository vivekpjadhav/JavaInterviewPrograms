public class EggDropping {

    public static int eggDrop(int egg, int floor){

        if (egg ==1){
            return floor;
        }
        if(floor ==0 || floor==1)
            return floor;

            int min = Integer.MAX_VALUE;
            int val;
        for (int i = 1; i <= floor ; i++) {
             val =1+ Math.max(eggDrop(egg-1,i-1) ,eggDrop(egg,floor-i));

            min =Math.min(val,min);

        }
        return min;
    }




    public static void main(String[] args) {
        System.out.println(eggDrop(1,6));

    }
}
