package by.vashket.labs.task4;

public class PrimeNumbers {

    private static boolean isPrimeNumber(int x)
    {
        if (x == 1 || x == 2) {
            return true;
        }
        int i = 1;
        do {
            i++;
            if (x % i == 0) {
                return false;
            }
        } while ((i<Math.sqrt(x)) || (Math.abs(i - Math.sqrt(x)) < 0.0001));
        return true;
    }

    private static int[] getPrimeNumbersIndexes(int[] Numbers)
    {
        int[] indexes = new int[Numbers.length];
        int j = 0;
        for (int i = 0; i < Numbers.length; i++) {
            if (isPrimeNumber(Numbers[i])) indexes[j++] = i;
        }

        int[] result = new int[--j];
        System.arraycopy(indexes, 0, result, 0, j);
        return result;
    }

    public static void makeTest()
    {
        int N = 20;
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Math.round((float)Math.random() * 100);
        }

        System.out.print("Numbers: ");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
        System.out.print("Prime numbers indexes: ");
        int[] primeNumbers = getPrimeNumbersIndexes(numbers);
        for (int j = 0; j < primeNumbers.length; j++) {
            System.out.print(primeNumbers[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        makeTest();
    }
}
