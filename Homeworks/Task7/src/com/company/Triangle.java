package com.company;

class Triangle implements Figure {
    private double firstSideTriangle;
    private double secondSideTriangle;
    private double thirdSideTriangle;
    private double heightTriangle;

    Triangle(double firstSideTriangle, double secondSideTriangle, double thirdSideTriangle, double heightTriangle) {
        this.firstSideTriangle = firstSideTriangle;
        this.secondSideTriangle = secondSideTriangle;
        this.thirdSideTriangle = thirdSideTriangle;
        this.heightTriangle = heightTriangle;
    }

    public void calculatePerimeter() {
        double perimetereTriangle = firstSideTriangle + secondSideTriangle + thirdSideTriangle;
        System.out.println("Периметр прямоугольника и квадрата: " + perimetereTriangle);
    }

    public void calculateArea() {
        double areaTriangle = 0.5 * firstSideTriangle * heightTriangle;
        System.out.println("Площадь прямоугольника и квадрата: " + areaTriangle);
    }
}
