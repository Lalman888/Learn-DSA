package Recursion.Sortings;

import java.util.Arrays;

public class InplaceMerge {
    public static void main(String[] args) {
        int[] a = {8, 3, 4, 12, 5, 6};
        System.out.println(Arrays.toString(a));
        mergeInplace(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }

    static void mergeInplace(int[] arr,int s,int e){
        if(e-s == 1){
            return;
        }
        int mid = s + (e-s)/2;

        mergeInplace(arr,s,mid);
        mergeInplace(arr,mid,e);

        mergeBoth(arr,s,mid,e);

    }

    private static void mergeBoth(int[] arr, int s, int mid, int e) {
        int[] combined = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i<mid && j <e){
            if(arr[i]<arr[j]){
                combined[k] = arr[i];
                i++;
            } else{
                combined[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<mid){
            combined[k] = arr[i];
            i++;
            k++;
        }

        while (j<e){
            combined[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < combined.length ; l++) {
           arr[s+l] = combined[l];
        }
    }


}
