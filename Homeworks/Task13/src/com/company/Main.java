package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utils utils = new Utils();

        while (true) {
            utils.showMenu();

            int command = scanner.nextInt();

            switch (command) {

//            Добавил владельца
                case 1: {
                    System.out.println("Введите имя");
                    String name = scanner.next();
                    System.out.println("Введите возраст:");
                    int age = scanner.nextInt();
                    System.out.println("Введите рост:");
                    int height = scanner.nextInt();
                    utils.addOwner(name, age, height);
                }
                break;

//            Добавил машину
                case 2: {
                    System.out.println("Введите id владельца:");
                    int ownerId = scanner.nextInt();
                    System.out.println("Введите гос.номер машины:");
                    int numberCar = scanner.nextInt();
                    System.out.println("Введите марку машины:");
                    String modelCar = scanner.next();
                    System.out.println("Введите цвет машины:");
                    String colorCar = scanner.next();
                    utils.addCar(ownerId, numberCar, modelCar, colorCar);
                }
                break;

//            Показал всех владельцев
                case 3: {
                    utils.showOwners();
                }
                break;

//            Показал все машины
                case 4: {
                    utils.showCars();
                }
                break;

//            Показать все машины владельца
                case 5: {
                    System.out.println("Введите id владельца");
                    int ownerId = scanner.nextInt();
                    utils.showCarsOfOwner(ownerId);
                }
                break;

//            Показать все машины одного цвета
                case 6: {
                    System.out.println("Укажите цвет машины");
                    String carColor = scanner.next();
                    utils.showCarsByColor(carColor);
                }
                break;

                case 7: {
                    System.exit(0);
                }
            }
        }
    }
}

