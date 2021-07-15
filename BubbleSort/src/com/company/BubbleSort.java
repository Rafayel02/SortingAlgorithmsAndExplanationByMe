package com.company;

/*
 * Explanation and complexity

 *  I am taking first node value and compare with second, node value and swap them if the first's node value
 * is bigger and so on till the end - 1 - count (count is steps, because every time the biggest value
 * gets it's place from back)
 *  Best case is, when the array is sorted, the time complexity will bew O(n) and worst case is reversed
 * sorted array, it will be (n-1) times take the first node value and compare n-1-counter time, which complexity
 * is o(n). So we get (n-1)n complexity steps: (n-1)n = n²-n ~ n² => The time complexity is O(n²).
 * TIME COMPLEXITY IN AVERAGE: O(n²), when array is sorted complexity is O(n).
 * */

public class BubbleSort {

    private static int[] array = {10, 14, 28, 11, 7, 16, 1, 30, 50, 25, 18, 2, 500, 0};

    public static void main(String[] args) {

        int counter = 0;
        boolean sorted = false;
        printArray(array);

        for(int i = 0; i < array.length-1; i++) {
            boolean inScope = false;
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    inScope = true;
                }
                counter++;
            }
            if (!inScope){
                break;
            }
        }

        System.out.println();
        printArray(array);
        System.out.println(counter);
    }

    public static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

}
