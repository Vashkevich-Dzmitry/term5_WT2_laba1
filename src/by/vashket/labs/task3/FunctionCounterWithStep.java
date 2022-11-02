package by.vashket.labs.task3;

public class FunctionCounterWithStep {

    private static double countFunction(double x)
    {
        return Math.tan(x);
    }

    private static void makeTable(double a, double b, double h)
    {
        double x = a;
        System.out.printf("|     x     |      F(x)    |%n");

        while (x <= b)
        {
            System.out.printf("|   %5.2f   |   %8.5f   |%n", x, countFunction(x));
            x += h;
        }
    }

    public static void makeTests()
    {
        int N = 5;
        double [] aValues = new double[N];
        double [] bValues = new double[N];
        double [] hValues = new double[N];

        for (int i = 0; i < N; i++)
        {
            aValues[i] = Math.random() * 10 - 5;
            bValues[i] = aValues[i] + Math.random() * 10;
            hValues[i] = Math.random() * 2;
        }

        for (int i = 0; i < N; i++)
        {
            makeTable(aValues[i], bValues[i], hValues[i]);
            System.out.printf("%n");
        }
    }

    public static void main(String[] args) {
        makeTests();
    }
}
