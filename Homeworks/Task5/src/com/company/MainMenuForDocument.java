package com.company;

import java.util.Scanner;

public class MainMenuForDocument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива под документы: ");
        int arrayDocumentsSize = scanner.nextInt();
        Document arrayDocument[] = new Document[arrayDocumentsSize];
        int count = 0;

        while (true) {
            Menu.showMenuDocuments();
            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    ArrayDocument.showDocument(arrayDocument);
                }

                case 2: {
                    ArrayDocument.createDocument(arrayDocument, count);
                    break;
                }

                case 3: {
                    System.out.println("Введите номер документа который хотите удалить: ");
                    int docDelete = scanner.nextInt();
                    ArrayDocument.deleteDocument(arrayDocument, docDelete, count);
                }

                case 4: {
                    System.out.println("Введите номер документа: ");
                    int number = scanner.nextInt();
                    Main.workInDocument(arrayDocument[number]);
                }
                break;

                case 5:
                    System.exit(0);
            }
        }
    }
}

