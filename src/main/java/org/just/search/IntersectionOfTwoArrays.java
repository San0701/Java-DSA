package org.just.search;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int k : nums1) {
            for (int i : nums2) {
                if (k == i && !list.contains(k)) {
                    list.add(k);
                }
            }
        }
        int n = list.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
