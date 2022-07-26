package com.asml.matrixtraversal;

import java.util.*;
import java.util.stream.Collectors;

public class MatrixTraversalImplementor {

    /**
     * Function to traverse matrix in spiral patten and return list of integers
     *
     * @param inputMatrix - Matrix to be printed in spiral
     * @return - List with integers added while traversing matrix
     */
    public static List<Integer> printMatrixInSpiral(int[][] inputMatrix) {
        List<Integer> integers = new ArrayList<>();
        if (isNullOrEmptyMatrix(inputMatrix)) {
            return integers;
        }
        Set<Integer> sizeSet = Arrays.stream(inputMatrix)
                .map(firstRow -> firstRow.length)
                .collect(Collectors.toSet());
        if (sizeSet.size() > 1) {
            return integers;
        }
        int eRow = inputMatrix.length;
        int eCol = inputMatrix[0].length;
        int sRow = 0, sCol = 0, i;

        while (sRow < eRow && sCol < eCol) {
            for (i = sCol; i < eCol; i++) {
                integers.add(inputMatrix[sRow][i]);
            }
            sRow++;
            for (i = sRow; i < eRow; i++) {
                integers.add(inputMatrix[i][eCol - 1]);
            }
            eCol--;
            if (sRow < eRow) {
                for (i = eCol - 1; i >= sCol; i--) {
                    integers.add(inputMatrix[eRow - 1][i]);
                }
                eRow--;
            }
            if (sCol < eCol) {
                for (i = eRow - 1; i >= sRow; i--) {
                    integers.add(inputMatrix[i][sCol]);
                }
                sCol++;
            }
        }
        return integers;
    }

    /**
     * Function to check if given Matrix is null or empty
     *
     * @param inputMatrix - The input Matrix
     * @return - boolean
     */
    private static boolean isNullOrEmptyMatrix(int[][] inputMatrix) {
        return Objects.isNull(inputMatrix) || inputMatrix.length == 0 || inputMatrix[0].length == 0;
    }

    /**
     * The main method
     *
     * @param args - command line args
     */
    public static void main(String[] args) {
        int[][] inputMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        List<Integer> integers = printMatrixInSpiral(inputMatrix);
        System.out.println(integers);
    }
}

