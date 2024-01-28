package com.villo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var arr = new int[]{5, 4, 3, 2, 1};

        for (var i = 0; i < arr.length - 1; i++) {
            var smallest = i;
            for (var j = i + 1; j < arr.length; j++)
                if (arr[smallest] > arr[j])
                    smallest = j;
            swap(arr, i, smallest);
        }

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