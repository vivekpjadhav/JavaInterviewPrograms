public class DroneFlightplanner {
    /**
     * You’re an engineer at a disruptive drone delivery startup and your CTO asks you to come up with an efficient algorithm
     * that calculates the minimum amount of energy required for the company’s drone to complete its flight.
     * You know that the drone burns 1 kWh (kilowatt-hour is an energy unit) for every mile it ascends,
     * and it gains 1 kWh for every mile it descends. Flying sideways neither burns nor adds any energy.
     * Given an array route of 3D points, implement a function calcDroneMinEnergy that computes and returns the minimal
     * amount of energy the drone would need to complete its route.
     * Assume that the drone starts its flight at the first point in route. That is, no energy was expended to place the drone at the starting point.
     * <p>
     * For simplicity, every 3D point will be represented as an integer array whose length is 3. Also,
     * the values at indexes 0, 1, and 2 represent the x, y and z coordinates in a 3D point, respectively.
     * <p>
     * Explain your solution and analyze its time and space complexities.
     */
    public static int calcDroneMinEnergy1(int[][] matrix) {
        int energy = 0;
        int ballace = 0;
        for (int i = 1; i < matrix.length; i++) {
            ballace = ballace + (matrix[i - 1][2] - matrix[i][2]);
            if (ballace < energy)
                energy = ballace;


        }
        return energy;
    }


    static int calcDroneMinEnergy(int[][] route) {
        // your code goes here
        int count = 0;
        int nextCount = 0;
        int j = 1;
        int result = 0;
        int lastValue = 0;
        for (int i = 0; j < route.length; i++) {

            count = route[i][2];
            nextCount = route[j][2];

            lastValue = lastValue + (count - nextCount);

           if(lastValue < result)
               result = lastValue;


            j++;
        }
        return result;

    }

    public static void main(String[] args) {
        int[][] route = {{0, 2, 10},
                {3, 5, 0},
                {9, 20, 6},
                {10, 12, 15},
                {10, 10, 8}};

        System.out.println(calcDroneMinEnergy(route));
        System.out.println(calcDroneMinEnergy1(route));

    }
}
