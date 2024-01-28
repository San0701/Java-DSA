package org.just.search;

public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(17));
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int start = 0, end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == num / mid) {
                return (double) num / mid - num / mid == 0;
            } else if (mid > num / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return false;
    }
}

