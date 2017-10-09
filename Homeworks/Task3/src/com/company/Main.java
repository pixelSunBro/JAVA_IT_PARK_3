package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeArray = scanner.nextInt();
        int array[] = new int[sizeArray];
        int sumEven = 0;
        int sumOdd = 0;
        int iEven = 0;
        int iOdd = 0;
        int max = 0;
        int maxLength = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число которе хотите поместить в ячейку массива под номером " + (i + 1));
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
            if (i % 2 == 0) {
                iEven += array[i];
            } else {
                iOdd += array[i];
            }
        }

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] < array[i + 1] & array[i + 1] > array[i + 2]) {
                max++;
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                maxLength++;

            }
            if (array[i] >= array[i + 1]) {
                maxLength++;
            }
        }

        System.out.println("Сумма четных элементов равна :" + sumEven);
        System.out.println("Сумма нечетных элементов равна :" + sumOdd);
        System.out.println("Сумма элементов, стоящих на четной позиции равна :" + iEven);
        System.out.println("Сумма элементов, стоящих на нечетной позиции :" + iOdd);
        System.out.println("Количество локальных максимумов " + max);
        System.out.println("Максимально длинная последовательность возрастающих чисел:" + maxLength);
        System.out.println("Замена нулей на отрицательное число следующего элемента: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = -array[i + 1];
            }
            System.out.print(array[i]);
        }
    }
}