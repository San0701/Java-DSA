package org.just.datastructure.array;

import org.just.datastructure.core.DataStructure;

public class Array implements DataStructure {
    public int[] arr;
    private int initializerSize = 10;
    private int size = 0;

    public Array(int[] arr) {
        this.arr = arr;
    }

    public Array() {
        this.arr = new int[initializerSize];
    }

    @Override
    public void insert(int data) {
        checkIfArrayIsFull();
        this.arr[size] = data;
        size++;
    }

    private void checkIfArrayIsFull() {
        if (this.size == this.initializerSize) {
            this.initializerSize += this.initializerSize;
            int[] additional = new int[this.size];
            System.arraycopy(arr, 0, additional, 0, this.size);
            this.arr = new int[this.initializerSize];
            System.arraycopy(additional, 0, arr, 0, this.size);
        }
    }

    @Override
    public void insertAt(int position, int data) {
        checkIfArrayIsFull();
        for (int i = size; i >= position; i--) {
            this.arr[i] = this.arr[i - 1];
        }
        this.arr[position - 1] = data;

    }

    @Override
    public int search(int data) {
        int position = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (data == arr[i]) {
                position = i + 1;
            }
        }
        if (position == Integer.MIN_VALUE) {
            throw new RuntimeException("Data not found");
        }
        return position;
    }

    @Override
    public int get(int position) {
        if (position > size) {
            throw new RuntimeException("Data not found");
        }
        return arr[position - 1];
    }

    @Override
    public void deleteAt(int position) {
        if (position < 0 || position > this.size) {
            throw new RuntimeException("Invalid position");
        }
        for (int i = position - 1; i < this.size; i++) {
            this.arr[i] = this.arr[i + 1];
        }
    }

    @Override
    public void deleteElement(int data) {
        int position = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (data == arr[i]) {
                position = i;
            }
        }
        for (int i = position; i < this.size; i++) {
            this.arr[i] = this.arr[i + 1];
        }

        if (position == Integer.MIN_VALUE) {
            throw new RuntimeException("Element not found");
        }

    }

    @Override
    public void update(int position, int data) {
        if (position < 0 || position > this.size) {
            throw new RuntimeException("Invalid position");
        }
        this.arr[position - 1] = data;

    }

    @Override
    public int getSize() {
        return this.size;
    }
}
