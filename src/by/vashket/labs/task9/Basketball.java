package by.vashket.labs.task9;

import java.util.List;

public class Basketball {
    private static double  getBallsWeight(Basket basket) {
        double weight = 0;
        for (var ball : basket.getBalls()) {
            weight += ball.getWeight();
        }
        return weight;
    }

    private static int getBlueBallsQuantity(Basket basket) {
        int quantity = 0;
        for (var ball : basket.getBalls()) {
            if (ball.getColor().equalsIgnoreCase("blue")) {
                quantity++;
            }
        }
        return quantity;
    }

    public static void main(String[] args) {
        Basket basket = new Basket(50);
        List<Ball> balls = List.of(
                new Ball(1, "yellow"),
                new Ball(2.5, "blue"),
                new Ball(3.5, "red"),
                new Ball(6, "black"),
                new Ball(9.5, "white"));
        basket.setBalls(balls);
        System.out.println("Weight = " + getBallsWeight(basket));
        System.out.println("Blue balls quantity = " + getBlueBallsQuantity(basket));
    }
}
