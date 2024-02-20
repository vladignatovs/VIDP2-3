package sorting;

import java.util.Arrays;

public class MainProgram {
    private final int[] array;

    public MainProgram(int[] array) {
        this.array = array;
    }

    public static int Smallest(int[] arr) {
        int smal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smal) {
                smal = arr[i];
            }
        }
        return smal;
    }
    
    public static int indexOfSmallest(int[] arr) {
        int smal = arr[0];
        int ind = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < smal) {
                smal = arr[i];
                ind = i;
            }
        }
        return ind;
    }

    public static int indexOfSmallestFrom(int[] arr, int n) {
        int smal = arr[n];
        int ind = 0;
        for(int i = n; i < arr.length; i++) {
            if (arr[i] < smal) {
                smal = arr[i];
                ind = i;
            }
        }
        if (ind == 0) {
            return n;
        } else {
            return ind;
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            MainProgram.swap(arr, i, MainProgram.indexOfSmallestFrom(arr, i));
        }
    }
}
