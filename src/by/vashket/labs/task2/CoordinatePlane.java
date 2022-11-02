package by.vashket.labs.task2;

public class CoordinatePlane {

    private static boolean IsPointBelongsToArea(double x, double y)
    {
        return ((Math.abs(x)<=6) && (y<=-3) && (y<=0)) || ((Math.abs(x)<=4) && (y >=0) && (y<=5));
    }

    public static void makeTests()
    {
        int N = 20;
        double[] xMassive = new double[N];
        double[] yMassive = new double[N];

        for (int i = 0; i < N; i++)
        {
            xMassive[i] = Math.random() * 10 - 5;
            yMassive[i] = Math.random() * 10 - 5;
        }

        for (int i = 0; i < N; i++)
        {
            System.out.println("Point (" + xMassive[i] + ", " + yMassive[i] + ") - " + IsPointBelongsToArea(xMassive[i], yMassive[i]));
        }
    }

    public static void main(String[] args) {
        makeTests();
    }
}
