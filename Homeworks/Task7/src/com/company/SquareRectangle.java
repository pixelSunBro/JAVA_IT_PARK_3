package com.company;

class SquareRectangle implements Figure{

    private double firstSideSquare;
    private double secondSideSquare;

    SquareRectangle(double firstSideSquare, double secondSideSquare) {
        this.firstSideSquare = firstSideSquare;
        this.secondSideSquare = secondSideSquare;
    }

    public void calculatePerimeter() {
        double perimeterSquareRectangle = firstSideSquare + secondSideSquare;
        System.out.println("Периметр прямоугольника и квадрата: " + perimeterSquareRectangle);
    }

    public void calculateArea() {
        double areaSquareRectangle = firstSideSquare * secondSideSquare;
        System.out.println("Площадь прямоугольника и квадрата: " + areaSquareRectangle);
    }
}
