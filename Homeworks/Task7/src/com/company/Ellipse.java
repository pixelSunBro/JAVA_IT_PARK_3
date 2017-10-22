package com.company;

class Ellipse implements Figure{
    private double semimajorAxis;
    private double minorAxis;

    Ellipse(double semimajorAxis, double minorAxis) {
        this.semimajorAxis = semimajorAxis;
        this.minorAxis = minorAxis;
    }

    public void calculatePerimeter() {
        double perimetereEllipse = 4 * (((Math.PI * semimajorAxis * minorAxis) + (semimajorAxis - minorAxis)) / (semimajorAxis + minorAxis));
        double roundingPperimetereEllipse = Math.round(perimetereEllipse);
        System.out.println("Периметр овала: " + roundingPperimetereEllipse);
    }

    public void calculateArea() {
        double squareEllipse = (Math.PI * semimajorAxis * minorAxis);
        double roundingAreaEllipse = Math.round(squareEllipse);
        System.out.println("Площадь овала: " + roundingAreaEllipse);
    }

}
