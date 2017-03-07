package com.darwindev.algo;

/**
 * Algorithm - Find the minimum value of an array
 * Time complexity: O(n)
 * Created by Zheng on 07/03/2017.
 */
public class FindMinimum implements Algo {

    public static int findMinimumValue(int[] inputData) {
        return findMinimumValue(inputData, 0, inputData.length);
    }

    public static int findMinimumIndex(int[] inputData) {
        return findMinimumIndex(inputData, 0, inputData.length);
    }

    public static int findMinimumValue(int[] inputData, int begin, int end) {
        int min = inputData[begin];
        for (int i = begin + 1; i < end; i++) {
            if (inputData[i] < min) min = inputData[i];
        }
        return min;
    }

    public static int findMinimumIndex(int[] inputData, int begin, int end) {
        int res = begin;
        for (int i = begin + 1; i < end; i++) {
            if (inputData[i] < inputData[res]) {
                res = i;
            }
        }
        return res;
    }

    public void perform(int[] tab) {
        findMinimumValue(tab);
    }

}