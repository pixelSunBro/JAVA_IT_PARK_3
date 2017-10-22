package com.company;

public class Main {
    public static void main(String[] args) {
        SquareRectangle squareRectangle = new SquareRectangle(5, 6);
        Circle circle = new Circle(8);
        Ellipse ellipse = new Ellipse(7, 3);
        Triangle triangle = new Triangle(2, 9, 4, 7);

        /*System.out.println("Периметр прямоугольника и квадрата: " + squareRectangle.calcPerimeterSquareRectangle());
        System.out.println("Площадь прямоугольника и квадрата: " + squareRectangle.calcSquareSquareRectangle());

        System.out.println("Периметр круга: " + circle.calcPerimeterCircle());
        System.out.println("Площадь круга: " + circle.calcSquareCircle());

        System.out.println("Периметр овала: " + ellipse.calcPerimetereEllipse());
        System.out.println("Площадь овала: " + ellipse.calcSquareEllipse());

        System.out.println("Периметр треугольника: " + triangle.calcPerimetereTriangle());
        System.out.println("Площадь треугольника: " + triangle.calcSquareTriangle());*/

         Figure figure[] = {squareRectangle, circle, ellipse, triangle};
        for(int i = 0; i < figure.length; i++) {
            figure[i].calculateArea();
            figure[i].calculatePerimeter();
        }
    }
}
