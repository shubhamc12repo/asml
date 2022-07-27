# Matrix Traversal

## Assignment: 
Given a 2D array
{{1,2,3,4},
{5,6,7,8},
{9,10,11,12},
{13,14,15,16}}

Traverse the array in the pattern below and print the numbers along the path.
Print: 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10

## Approach: 
To divide the matrix into squares by the edges and adding to the list that has to be printed.

## Algorithm:

1. Initialize starting row and column index as 0.
2. From the given matrix, calculate the ending row and ending column index as matrix.length and matrix[rowIndex].length.
3. Run loops to add elements into the list in a clockwise manner considering the edges of matrix.
4. Loop through the starting row, add elements into the list and increase the value of starting row index.
5. Loop through the ending column, add elements into the list decrease the value of ending column index.
6. Loop through the ending row, add elements into the list and decrease the value of ending row index.
7. Loop through the starting column, add elements into the list  and increase the count of starting column index.
8. Repeat steps 3 to 7 till starting row index is greater than ending row index and starting column index is greater than ending column index.

## Complexity Analysis: 

Time Complexity: O(m*n) where m and n are number of rows and columns of the matrix.

Auxiliary Space: O(N).
