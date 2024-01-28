package org.just.datastructure;

import org.just.datastructure.array.Array;

public class DSMain {
    public static void main(String[] args) {
        Array array = new Array();
        /*for (int i = 1; i <= 10; i++) {
            array.insert(i);

        }*/
        /*for (int i = 0; i < 100; i++) {

            System.out.println(array.arr[i]);
        }*/

        array.insert(1);
        array.insert(2);
        array.insert(4);
        array.insert(5);
        array.insert(6);
        array.insertAt(3, 3);

        System.out.println(array.search(3));
        System.out.println(array.search(33));


    }
}
