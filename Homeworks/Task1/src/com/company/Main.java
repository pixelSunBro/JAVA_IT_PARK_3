package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ввидите сумму которую хотите снять: ");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int dividers[] = {5000, 1000, 500, 100, 50, 10, 5, 2, 1};
        for (int i = 0; i < dividers.length; i++) {
            int number = sum / dividers[i];
            System.out.println("Вы получите " + number + " купюр, наминалом " + dividers[i]);
            sum = sum - dividers[i] * number;
        }
    }
}