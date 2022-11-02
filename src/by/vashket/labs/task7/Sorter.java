package by.vashket.labs.task7;

import java.util.Arrays;
import java.util.Random;

public class Sorter {

    public static void shell(double[] numbers)
    {
        double temp;
        double eps = 0.001;

        for (int i = 0; i < numbers.length - 1; ) {
            if ((numbers[i+1] > numbers[i])
                    || (Math.abs(numbers[i+1] - numbers[i]) < eps)) {
                i++;
            } else {
                temp = numbers[i+1];
                numbers[i+1] = numbers[i];
                numbers[i] = temp;
                if (i != 0) {
                    i--;
                }
            }
        }
    }

    public static void makeTest()
    {
        Random random = new Random();

        int n = random.nextInt(20, 30);
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 50 - 25;
        }
        System.out.println(Arrays.toString(arr));
        shell(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        makeTest();
    }
}
