package by.vashket.labs.task5;

import java.util.Arrays;
import java.util.Random;

public class SequenceRemover {

    private static int getElementsToBeRemovedMinQuantity(int[] numbers) {
        int result = 0;
        int temp = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (temp < numbers[i]) {
                result++;
            } else {
                temp = numbers[i];
            }
        }

        return result;
    }

    public static void makeTest() {
        Random random = new Random();
        int n = random.nextInt(10, 30);
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(getElementsToBeRemovedMinQuantity(numbers));
    }

    public static void main(String[] args) {
        makeTest();
    }
}
