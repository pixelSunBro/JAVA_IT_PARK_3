package com.company;

public class Document {
    String array[] = new String[100];
    int count = 0;

    void showArray() {                                      //1
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }

    void beginningString(String addBeginning) {             //2
        for (int i = count; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = addBeginning;
        count++;
    }

    void endString(String addEnd) {                         //3
        array[count] = addEnd;
        count++;
    }

    void deleteString(int deleteElement) {                  //4
        for (int i = deleteElement - 1; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    void changeString(int changeElement, String newValue) { //5
        array[changeElement - 1] = newValue;
    }

    void clearString(int clearElement) {                    //6
        array[clearElement - 1] = null;
    }
}

