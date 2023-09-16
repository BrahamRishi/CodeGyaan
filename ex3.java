
public class ex3  {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrixB = {
                {9, 8, 7},
                {6, 5, 4},
                {4, 5, 6}
        };

        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        if (resultMatrix != null) {
            System.out.println("Matrix A:");
            printMatrix(matrixA);

            System.out.println("Matrix B:");
            printMatrix(matrixB);

            System.out.println("Result (A * B):");
            printMatrix(resultMatrix);
        } else {
            System.out.println("Matrix multiplication is not possible due to invalid dimensions.");
        }
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int numRowsA = A.length;
        int numColsA = A[0].length;
        int numRowsB = B.length;
        int numColsB = B[0].length;

        if (numColsA != numRowsB) {
            return null; // Matrix multiplication is not possible
        }

        int[][] result = new int[numRowsA][numColsB];

        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsB; j++) {
                int sum = 0;
                for (int k = 0; k < numColsA; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
