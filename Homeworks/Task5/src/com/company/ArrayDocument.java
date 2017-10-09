package com.company;

public class ArrayDocument {
    static void showDocument(Document[] arrayDocument) {
        for (int i = 0; i < arrayDocument.length; i++) {
            String value = arrayDocument[i] == null ? "_______" : "Документ № " + (i + 1);
            System.out.println(value);
        }
    }

    static void createDocument(Document[] arrayDocument, int count) {
        for (int i = 0; i < arrayDocument.length; i++) {
            if (arrayDocument[i] == null) {
                arrayDocument[i] = new Document();
                count++;
                break;
            }
        }
    }

    static void deleteDocument(Document[] arrayDocument, int docDelete, int count) {
        for (int i = 0; i < arrayDocument.length - docDelete - 1; i++) {
            arrayDocument[docDelete + i] = arrayDocument[docDelete + i + 1];
        }
        arrayDocument[arrayDocument.length - 1] = null;
        count--;
    }
}
