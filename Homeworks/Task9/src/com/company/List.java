package com.company;

public interface List {
    void add(int a);
    void delete(int i);
    void deleteLast();
    void searchByIndex(int i);
    void addByIndex(int i, int a);
    void returnIterator(Iterator iterator);
}
