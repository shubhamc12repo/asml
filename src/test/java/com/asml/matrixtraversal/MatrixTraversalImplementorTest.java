package com.asml.matrixtraversal;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MatrixTraversalImplementorTest {

    /**
     * Test case to check for multiple row and multiple columns Matrix as input.
     */
    @Test
    public void testPrintMatrixInSpiralWithMultipleRowsAndColumns() {
        //given
        int[][] input = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6}};
        List<Integer> expected = List.of(1, 2, 4, 6, 5, 3);
        //when
        List<Integer> actual = MatrixTraversalImplementor.printMatrixInSpiral(input);

        //then
        Assert.assertEquals(expected, actual);
    }

    /**
     * Test case to check for single column and multiple row Matrix as input.
     */
    @Test
    public void testPrintMatrixInSpiralWithSingleColumnMultipleRow() {
        //given
        int[][] input = new int[][]{
                {1},
                {3},
                {5}};
        List<Integer> expected = List.of(1, 3, 5);
        //when
        List<Integer> actual = MatrixTraversalImplementor.printMatrixInSpiral(input);

        //then
        Assert.assertEquals(expected, actual);
    }

    /**
     * Test case to check for single row and multiple column Matrix as input.
     */
    @Test
    public void testPrintMatrixInSpiralWithSingleRowMultipleColumn() {
        //given
        int[][] input = new int[][]{{1, 2, 3}};
        List<Integer> expected = List.of(1, 2, 3);
        //when
        List<Integer> actual = MatrixTraversalImplementor.printMatrixInSpiral(input);

        //then
        Assert.assertEquals(expected, actual);
    }

    /**
     * Test case to check for Empty matrix as input.
     */
    @Test
    public void testPrintMatrixInSpiralIfEmptyInput() {
        //given
        int[][] input = new int[][]{{}, {}};
        List<Integer> expected = List.of();
        //when
        List<Integer> actual = MatrixTraversalImplementor.printMatrixInSpiral(input);

        //then
        Assert.assertEquals(expected, actual);
    }

    /**
     * Test case to check for Null matrix as input.
     */
    @Test
    public void testPrintMatrixInSpiralIfNullInput() {
        //given
        List<Integer> expected = List.of();
        //when
        List<Integer> actual = MatrixTraversalImplementor.printMatrixInSpiral(null);

        //then
        Assert.assertEquals(expected, actual);
    }

    /**
     * Test case to check for inaccurate Matrix as input.
     */
    @Test
    public void testPrintMatrixInSpiralWithInnacurateSizeOfInput() {
        //given
        int[][] input = new int[][]{
                {1},
                {3, 4},
                {5, 6}};
        List<Integer> expected = List.of();
        //when
        List<Integer> actual = MatrixTraversalImplementor.printMatrixInSpiral(input);

        //then
        Assert.assertEquals(expected, actual);
    }
}
