package com.Sachin.Bitwise;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 4 };
        System.out.println(ans( arr ));
    }

      static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr) {
            unique ^= n;
        }

        return unique;
    }
}
