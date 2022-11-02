package by.vashket.labs.task6;

public class MatrixBuilder {

    public static void makeTest() {
        int n = 10;
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = i;
        }
        buildMatrix(digits);
    }

    private static void buildMatrix(int[] numbers) {
        int size = numbers.length;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = numbers[(i + j) % size];
                System.out.printf("%5d",matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        makeTest();
    }
}
