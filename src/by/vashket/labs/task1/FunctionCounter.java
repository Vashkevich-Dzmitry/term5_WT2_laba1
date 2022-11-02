package by.vashket.labs.task1;

public class FunctionCounter {

    private static double countResult(double x, double y)
    {
        return ((1 + Math.sin(x + y) * Math.sin(x + y)) / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y)))) + x;
    }

    public static void makeTests()
    {
        int N = 20;
        double[] xMassive = new double[N];
        double[] yMassive = new double[N];

        for (int i = 0; i < N; i++)
        {
            xMassive[i] = Math.random() * 100;
            yMassive[i] = Math.random() * 100;
        }

        for (int i = 0; i < N; i++)
        {
            System.out.println("f(" + xMassive[i] + ", " + yMassive[i] + ") = " + countResult(xMassive[i], yMassive[i]));
        }
    }

    public static void main(String[] args)     {
        makeTests();
    }
}
