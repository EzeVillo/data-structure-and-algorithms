package com.villo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var arr = new int[]{5, 4, 3, 2, 1};
        var i = 0;
        boolean flag;

        do {
            flag = false;
            for (var j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            i++;
        } while (i < arr.length - 1 && flag);

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j)
            return;

        if (i < 0 || j < 0)
            return;

        if (i >= arr.length || j >= arr.length)
            return;

        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}