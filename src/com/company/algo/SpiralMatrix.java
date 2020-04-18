package com.company.algo;

import java.util.Arrays;

public class SpiralMatrix {
    static int[][] inputMatrix = {{1, 2, 3, 4, 5},
            {14, 15, 16, 17, 6},
            {13, 20, 19, 18, 7},
            {12, 11, 10, 9, 8}};


    static int[] spiralMatrix(int[][] matrix) {

        int row = inputMatrix.length;
        int col = inputMatrix[0].length;
        int[] result = new int[row * col];

        int topRow = 0;
        int bottomRow = row - 1;
        int leftCol = 0;
        int rightCol = col - 1;
        int index = 0;

        while (topRow <= bottomRow && leftCol <= rightCol) {

            for (int i = leftCol; i <= rightCol ; i++) {
                result[index++] = inputMatrix[topRow][i];
            }
            topRow++;



            for (int i = topRow; i <= bottomRow; i++) {
                result[index++] = matrix[i][rightCol];

            }
            rightCol--;

            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    result[index++] = matrix[bottomRow][i];
                }
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    result[index++] = matrix[i][leftCol];
                }
                leftCol++;
            }

            return result;

        }


        return result;
    }

    public static void main(String[] args) {
        int[] result = spiralMatrix(inputMatrix);
        Arrays.stream(result).forEach(System.out::print);
    }
}
