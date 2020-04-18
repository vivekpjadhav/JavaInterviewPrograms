package com.company.algo;

import java.util.Arrays;

public class NewSpiral {

    static int[][] inputMatrix = {{1, 2, 3, 4, 5},
            {14, 15, 16, 17, 6},
            {13, 20, 19, 18, 7},
            {12, 11, 10, 9, 8}};

    static int[] spiralCopy(int[][] inputMatrix) {
        // your code goes here
        int[] spiral = new int[inputMatrix.length * inputMatrix[0].length];
        int minXIndex = 0;
        int maxXIndex = inputMatrix.length;
        int minYIndex = 0;
        int maxYIndex = inputMatrix[0].length;

        int count = 0;

        while (count != inputMatrix.length * inputMatrix[0].length) {
            //Move right

            if (maxYIndex > minYIndex - 1) {
                for (int i = minXIndex; i < maxXIndex; i++) {
                    spiral[count] = inputMatrix[minYIndex][i];
                    count++;
                }
                minYIndex++;
            }

            //Move down
            if (maxXIndex > minXIndex - 1) {
                for (int i = minYIndex; i <= maxYIndex; i++) {
                    spiral[count++] = inputMatrix[i][maxXIndex];
                }
                maxXIndex--;
            }

            //Move left
            if (maxYIndex > minYIndex - 1) {
                for (int i = maxXIndex; i <= minXIndex; i--) {
                    spiral[count++] = inputMatrix[maxYIndex][i];
                }
                maxYIndex--;
            }

            //Move up
            if (maxXIndex > minXIndex) {
                for (int i = maxYIndex; i < minYIndex; i--) {
                    spiral[count] = inputMatrix[i][minXIndex];
                    count++;
                }
                minXIndex++;
            }

        }
        return spiral;
    }


    public static void main(String[] args) {
        int[] result = spiralCopy(inputMatrix);
        Arrays.stream(result).forEach(System.out::print);
    }

}
