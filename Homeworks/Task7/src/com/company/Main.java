package com.company;

public class Main {
    public static void main(String[] args) {
        SquareRectangle squareRectangle = new SquareRectangle(5, 6);
        Circle circle = new Circle(8);
        Ellipse ellipse = new Ellipse(7, 3);
        Triangle triangle = new Triangle(2, 9, 4, 7);

        Figure figure[] = {squareRectangle, circle, ellipse, triangle};
        for (int i = 0; i < figure.length; i++) {
            figure[i].calculateArea();
            figure[i].calculatePerimeter();
        }
    }
}
