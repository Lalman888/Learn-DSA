package Recursion.Sortings;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {8, 3, 4, 12, 5, 6};
        for (int ele :
                a) {
            System.out.print(ele + " ");

        }
        System.out.println();
        a = mergeSort(a);
        for (int ele :
                a) {
            System.out.print(ele + " ");

        }
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] combined = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] < right[j]) {
                combined[k] = left[i];
                i++;
            } else {
                combined[k] = right[j];
                j++;
            }
            k++;
        }

//        it may be possible one of the array is longer than other  , copy remain elements in array

        while (i < left.length) {
            combined[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            combined[k] = right[j];
            j++;
            k++;
        }

        return combined;

    }
}
