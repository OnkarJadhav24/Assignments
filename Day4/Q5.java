//Q5 java program that determines whether two matrices are equal.

class MatrixEquality {
    public static void main(String[] args) {
        // Define two matrices with the same number of rows and columns
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Change values for inequality

        // Check if matrices are equal
        boolean areEqual = true;

        // Compare each element of matrix with the corresponding element of matrix2
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    areEqual = false;
                    break; // If any element is not equal, break out of the loop
                }
            }
        }

        // Print a message indicating whether the matrices are equal or not
        if (areEqual) {
            System.out.println("Matrices are equal.");
        } else {
            System.out.println("Matrices are not equal.");
        }
    }
}