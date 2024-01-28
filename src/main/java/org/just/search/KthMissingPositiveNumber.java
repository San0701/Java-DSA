package org.just.search;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{1, 2, 3, 4}, 2));
    }

    public static int findKthPositive(int[] arr, int k) {
        int n = 1, count = 0, result = 0, i = 0;
        while (i < arr.length && count < k) {
            if (arr[i] != n) {
                result = n;
                count++;
            } else {
                i++;
            }
            n++;
        }
        return (count < k) ? k - count + arr[arr.length - 1] : result;
    }
}
