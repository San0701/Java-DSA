package org.just.search;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println((int) 'a');
    }

    public static int arrangeCoins(int n) {
        boolean flag = true;
        int steps = 1;
        while (flag) {
            n -= steps;

            if (n < 0) {
                return steps - 1;
            }
            steps++;
        }
        return n;
    }
}
