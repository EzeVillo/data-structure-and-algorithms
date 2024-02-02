package com.villo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var arr = new int[]{5, 4, 3, 2, 1};

        for (var i = 1; i < arr.length; i++) {
            int j;
            var value = arr[i];
            for (j = i; j > 0 && arr[j - 1] > value; j--)
                arr[j] = arr[j - 1];
            arr[j] = value;
        }

        System.out.println(Arrays.toString(arr));
    }
}