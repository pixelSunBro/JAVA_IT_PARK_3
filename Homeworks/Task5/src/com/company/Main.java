package com.company;

import java.util.Scanner;

public class Main {
    public static void workInDocument(Document document) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            Menu.showMenu();
            int command = scanner.nextInt();

            switch (command) {

                case 1: {
                    if (document.count == 0) {
                        System.out.println("Масств пуст");
                    } else {
                        document.showArray();
                    }
                    System.out.println(" ");
                }
                break;

                case 2: {
                    if (document.count == document.array.length) {
                        System.err.println("Масив полон");
                    } else {
                        System.out.print("Введите строку для добавления в начало списка: ");
                        String addBeginning = scanner.next();
                        document.beginningString(addBeginning);
                    }
                    break;
                }

                case 3: {
                    if (document.count == document.array.length) {
                        System.err.println("Масив полон");
                    } else {
                        System.out.print("Введите строку для добавления в конец списка: ");
                        String addEnd = scanner.next();
                        document.endString(addEnd);
                    }
                    break;
                }

                case 4: {
                    if (document.count == 0) {
                        System.err.println("Масив пуст");
                    } else {
                        System.out.print("Укажите номер элемента который хотите удалить: ");
                        int deleteElement = scanner.nextInt();
                        document.deleteString(deleteElement);
                    }
                    break;
                }

                case 5: {
                    if (document.count == 0) {
                        System.err.println("Масив пуст");
                    } else {
                        System.out.print("Укажите номер элемента который хотите заменить: ");
                        int changeElement = scanner.nextInt();
                        System.out.print("Введите строку для добавления в выбранный элемент: ");
                        String newValue = scanner.next();
                        document.changeString(changeElement, newValue);
                    }
                    break;
                }

                case 6: {
                    System.out.print("Укажите номер элемента который хотите очистить: ");
                    int clearElement = scanner.nextInt();
                    if (document.array[clearElement - 1] == null) {
                        System.err.println("Этот элемент уже пуст");
                        break;
                    } else {
                        document.clearString(clearElement);
                    }
                    break;
                }

                case 7: {
                    System.exit(0);
                }
            }
        }
    }
}