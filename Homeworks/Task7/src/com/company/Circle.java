package com.company;

class Circle implements Figure{
    private double radius;

     Circle(double radius) {
        this.radius = radius;
    }

    public void calculatePerimeter() {
        double perimeterCircle = 2 * Math.PI  * radius;
        double roundingPerimeterCircle = Math.round(perimeterCircle);
        System.out.println("Периметр круга: " + roundingPerimeterCircle);
    }

    public void calculateArea() {
        double areaCircle = Math.PI  * (radius * radius);
        double roundingAreaCircle = Math.round(areaCircle);
        System.out.println("Площадь круга: " + roundingAreaCircle);
    }
}
