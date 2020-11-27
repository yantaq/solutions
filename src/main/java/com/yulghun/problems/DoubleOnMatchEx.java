package com.yulghun.problems;

import java.util.Arrays;

public class DoubleOnMatchEx {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,11,12,8};
        int num = 2;
        int result = new DoubleOnMatchEx().maxNum(arr, num);

        // if -1 no match found for num
        if (result != -1) {
            System.out.println("Max num is: " + result);
        } else {
            System.out.println("No match found for: " + num);
        }

    }

    /**
     * 1. sort the array
     * 2. iterate each element
     * 3. compare each element to num
     * 4. multiply the element if equal to num and assign the result to num
     * 5. repeat from step 1
     * @param arr
     * @param num
     * @return
     */
    public int maxNum(int[] arr, int num) {
        // sor the array
        Arrays.sort(arr);
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
           if (num == arr[i]) {
               max = arr[i] * 2;
               num = max;
           }
        }

        return max;
    }
}
