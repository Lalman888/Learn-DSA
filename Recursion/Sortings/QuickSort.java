package Recursion.Sortings;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {8, 3, 4, 12, 5, 6};
        System.out.println(Arrays.toString(a));
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void quick(int[] nums,int low,int high) {
        if(low>=high){
            return;
        }

        int start = low;
        int end = high;

        int mid = start + (end-start)/2;
        int pivot = nums[mid];

        while (start<=end){
            while (nums[start]< pivot){
                start++;
            }
            while (nums[end]>pivot){
                end--;
            }

            if(start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        quick(nums,low,end);
        quick(nums,start,high);
    }
}
