package com.company;

public class BubbleSort {

    private static int[] array = {10, 14, 28, 11, 7, 16, 1, 30, 50, 25, 18, 2, 500, 0};

    public static void main(String[] args) {

        int counter = 0;
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
