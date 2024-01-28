package org.just.datastructure.core;

public interface DataStructure {
    void insert(int data);

    void insertAt(int position, int data);

    int search(int data);

    int get(int position);

    void deleteAt(int position);

    void deleteElement(int data);

    void update(int position, int data);

    int getSize();
}
