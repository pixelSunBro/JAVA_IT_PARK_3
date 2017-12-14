package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Список создан!!!");
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        Iterator iterator = new ArrayIterator();

        while (true) {

            Menu.showMenu();

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    System.out.println("Введите значение: ");
                    int addInt = scanner.nextInt();
                    list.add(addInt);
                }
                break;
                case 2: {
                    list.deleteLast();
                }
                break;
                case 3: {
                    System.out.println("Введите значение: ");
                    int addByIndexInt = scanner.nextInt();
                    System.out.println("Введите индекс: ");
                    int addByIndexIndex = scanner.nextInt();
                    list.addByIndex(addByIndexIndex, addByIndexInt);
                }
                break;
                case 4: {
                    System.out.println("Введите индекс: ");
                    int delInt = scanner.nextInt();
                    list.delete(delInt);
                }
                break;
                case 5: {
                    System.out.println("Введите индекс: ");
                    int searchByIndexIndex = scanner.nextInt();
                    list.searchByIndex(searchByIndexIndex);
                }
                break;
                case 6: {
                    list.returnIterator(iterator);
                }
                break;
                case 7:
                    System.out.println("Увидимся");
                    System.exit(0);
            }
        }
    }
}
