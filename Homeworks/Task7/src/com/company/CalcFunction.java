package com.company;

public class CalcFunction {

    static double calcPerimeterSquareRectangle(double firstSideSquare, double secondSideSquare) {
        double perimeterSquareRectangle =  firstSideSquare + secondSideSquare;
        return perimeterSquareRectangle;
    }

    static double calcSquareSquareRectangle(double firstSideSquare, double secondSideSquare) {
        double squareSquareRectangle =  firstSideSquare * secondSideSquare;
        return squareSquareRectangle;
    }

    static double calcPerimeterCircle (double radius) {
        double perimeterCircle = 2 * Math.PI  * radius;
        double roundingSquareCircle = Math.round(perimeterCircle);
        return roundingSquareCircle;
    }

    static double calcSquareCircle (double radius) {
        double squareCircle = Math.PI  * (radius * radius);
        double roundingSquareCircle = Math.round(squareCircle);
        return roundingSquareCircle;

    }

    static double calcPerimetereEllipse (double semimajorAxis, double minorAxis) {
        double perimetereEllipse = 4 * (((Math.PI * semimajorAxis * minorAxis) + (semimajorAxis - minorAxis)) / (semimajorAxis + minorAxis));
        double roundingPperimetereEllipse = Math.round(perimetereEllipse);
        return roundingPperimetereEllipse;
    }

    static double calcSquareEllipse (double semimajorAxis, double minorAxis) {
        double squareEllipse = (Math.PI * semimajorAxis * minorAxis);
        double roundingSquareEllipse = Math.round(squareEllipse);
        return roundingSquareEllipse;
    }

    static double calcPerimetereTriangle (double firstSideTriangle,  double secondSideTriangle, double thirdSideTriangle) {
        double perimetereTriangle = firstSideTriangle + secondSideTriangle + thirdSideTriangle;
        return perimetereTriangle;
    }

    static double calcSquareTriangle (double firstSideTriangle, double heightTriangle) {
        double perimetereTriangle = 0.5 * firstSideTriangle * heightTriangle;
        return perimetereTriangle;
    }
}
