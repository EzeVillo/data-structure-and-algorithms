package com.villo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var arr = new int[]{5, 4, 3, 2, 1};

        for (var gap = arr.length / 2; gap > 0; gap /= 2) {
            for (var i = gap; i < arr.length; i++) {
                var value = arr[i];
                var j = i;
                while (j >= gap && arr[j - gap] > value) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = value;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}