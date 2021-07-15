package com.company;
/*
* Explanation and complexity

*  I am taking every node till the penultimate node (count of this process is n-1, where n is length of array)
* and get the minimum node value after current node value in array, namely checking with every node value started
* from next of current node value till the end (time complexity of this process is O(n)).
*  So we get (n-1)n complexity steps: (n-1)n = n²-n ~ n² => The time complexity is O(n²).
*  TIME COMPLEXITY IS ALWAYS: O(n²), also when array is sorted.
*  I am doing changes in array, so i don't use additional memory. only temp variable.
*/

public class SelectionSort {
    private static int[] array = {10, 14, 28, 11, 7, 16, 1, 30, 50, 25, 18, 2, 500, 0};

    public static void main(String[] args) {
        int arrayLength = array.length;
        printArray(array);
        for (int i = 0; i < arrayLength-1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j<arrayLength; j++) {
                if(array[j] < array[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            int temp = array[minValueIndex];
            array[minValueIndex] = array[i];
            array[i] = temp;
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for(int a: array) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

}
