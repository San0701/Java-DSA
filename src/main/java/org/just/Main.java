package org.just;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        char[] valids = new char[s.length()];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (((int) chars[i] >= 65 && (int) chars[i] <= 90) || (((int) chars[i] >= 97 && (int) chars[i] <= 122))) {
                valids[count] = String.valueOf(chars[i]).toLowerCase().toCharArray()[0];
                count++;
            }
        }
        if (count < 2) {
            return false;
        }

        int start = 0, end = count - 1;
        while (start <= end) {
            char left = valids[start];
            char right = valids[end];
            if (left != right) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}