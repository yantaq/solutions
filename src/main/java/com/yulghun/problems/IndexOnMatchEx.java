package com.yulghun.problems;

public class IndexOnMatchEx {

    public static void main(String[] args) {
//        int[] input = new int[] {2, 3, 4, 4, 1};
//        int[] input = new int[] {4, 4, 4};
        int[] input = new int[] {3, 2, 2, 4, 5, 2, 4};
//        int[] input = new int[] {3, 2, 2, 1, 5, 2, 4};

        int result = new IndexOnMatchEx().arraySum(input);

        if (result != -1) {
            System.out.println("Index found: " + result);
        } else {
            System.out.println("No such index found.");
        }
    }

    public int arraySum(int[] arr) {

        // if array doesn't have al least three elements
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array must have three or more elements.");
        }

        for (int i = 0; i < arr.length - 2 ; i++) {
            int leftIndex = i;
            int rightIndex = leftIndex + 2;

            int lsum = arr[leftIndex];
            int rsum = arr[rightIndex];

            while (leftIndex >=0 && rightIndex < arr.length) {

                // found the sum and return mid index
                if (lsum == rsum) return i + 1;

                if (lsum < rsum ) {
                    leftIndex--;
                    if (leftIndex >= 0) lsum = lsum + arr[leftIndex];
                }

                if (lsum > rsum ) {
                    rightIndex++;
                    if (rightIndex < arr.length) rsum = rsum + arr[rightIndex];
                }
            } // end while

        } // end for

        return -1;
    }
}