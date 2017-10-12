package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] figure = new String[5];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Menu.showMenu();
            double command = scanner.nextDouble();
            switch ((int) command) {
                case 1: {
                    System.out.println("Укажите длинну сторон квадрата");
                    System.out.print("Превая сторона: ");
                    double firstSideSquare = scanner.nextDouble();
                    System.out.print("Вторая сторона: ");
                    double secondSideSquare = scanner.nextDouble();
                    System.out.println("Периметр треугольника равен: " + CalcFunction.calcPerimeterSquareRectangle(firstSideSquare, secondSideSquare));
                    System.out.println("Площадь треугольника равен: " + CalcFunction.calcSquareSquareRectangle(firstSideSquare, secondSideSquare));
                    figure[0] = "Квадрат: " + "Периметр " + CalcFunction.calcPerimeterSquareRectangle(firstSideSquare, secondSideSquare) + " " + "Площадь " + CalcFunction.calcSquareSquareRectangle(firstSideSquare, secondSideSquare);
                }
                break;

                case 2: {
                    System.out.println("Укажите длинну сторон прямоугольника");
                    System.out.print("Превая сторона: ");
                    double firstSideSquare = scanner.nextDouble();
                    System.out.print("Вторая сторона: ");
                    double secondSideSquare = scanner.nextDouble();
                    System.out.println("Периметр прямоугольника равен: " + CalcFunction.calcPerimeterSquareRectangle(firstSideSquare, secondSideSquare));
                    System.out.println("Площадь прямоугольника равен: " + CalcFunction.calcSquareSquareRectangle(firstSideSquare, secondSideSquare));
                    figure[1] = "Прямоугольник: " + "Периметр " + CalcFunction.calcPerimeterSquareRectangle(firstSideSquare, secondSideSquare) + " " + "Площадь " + CalcFunction.calcSquareSquareRectangle(firstSideSquare, secondSideSquare);
                }
                break;

                case 3: {
                    System.out.println("Укажите радиус круга: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Периметр круга равен: " + CalcFunction.calcPerimeterCircle(radius));
                    System.out.println("Площад круга равен: " + CalcFunction.calcSquareCircle(radius));
                    figure[2] = "Круг: " + "Периметр " + CalcFunction.calcPerimeterCircle(radius) + " " + "Площадь " + CalcFunction.calcSquareCircle(radius);
                }
                break;

                case 4: {
                    System.out.println("Укажите длинну большой полуоси: ");
                    double semimajorAxis = scanner.nextDouble();
                    System.out.println("Укажите длинну малой полуоси: ");
                    double minorAxis = scanner.nextDouble();
                    System.out.println("Периметр овала равен: " + CalcFunction.calcPerimetereEllipse(semimajorAxis, minorAxis));
                    System.out.println("Площадь овала равен: " + CalcFunction.calcSquareEllipse(semimajorAxis, minorAxis));
                    figure[3] = "Овал: " + "Периметр " + CalcFunction.calcPerimetereEllipse(semimajorAxis, minorAxis) + " " + "Площадь " + CalcFunction.calcSquareEllipse(semimajorAxis, minorAxis);
                }
                break;

                case 5: {
                    System.out.println("Укажите длинну первой стороны/основания треугольника: ");
                    double firstSideTriangle = scanner.nextDouble();
                    System.out.println("Укажите длинну второй стороны треугольника: ");
                    double secondSideTriangle = scanner.nextDouble();
                    System.out.println("Укажите длинну третьей стороны треугольника: ");
                    double thirdSideTriangle = scanner.nextDouble();
                    System.out.println("Укажите высоту треугольника: ");
                    double heightTriangle = scanner.nextDouble();
                    System.out.println("Периметр треугольника равен: " + CalcFunction.calcPerimetereTriangle(firstSideTriangle, secondSideTriangle, thirdSideTriangle));
                    System.out.println("Площадь треугольника равна: " + CalcFunction.calcSquareTriangle (firstSideTriangle, heightTriangle));
                    figure[4] = "Треугольник: " + "Периметр " + CalcFunction.calcPerimetereTriangle(firstSideTriangle, secondSideTriangle, thirdSideTriangle) + " " + "Площадь " + CalcFunction.calcSquareTriangle (firstSideTriangle, heightTriangle);
                }
                break;

                case 6: {
                    for (int i = 0; i < figure.length; i++) {
                        System.out.println(figure[i]);
                    }
                }
            }
        }
    }
}
