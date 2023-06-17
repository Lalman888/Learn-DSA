package Recursion.Sortings;

public class Bubble {
    public static void main(String[] args) {
//        int[] ar = {3,4,8,1,2,5,6,7};
        int[] ar = {4,3,2,1,0,2,0};
//        wrong solution
//        sortBubble(ar,ar.length-1,0);

        sortB(ar,ar.length-1,0);
        for (int ele: ar) {
            System.out.print(" "+ele);
        }
    }

    private static void sortB(int[] arr, int r, int c) {
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            sortB(arr,r,c+1);
        } else {
            sortB(arr,r-1,0);
        }

    }

    private static int[] sortBubble(int[] arr,int r,int c) {
        if(r == 0){
            return arr;
        }
        if(c == arr.length-2){
          return sortBubble(arr,r-1,0);
        }
        if(arr[r]<arr[c]){
            int temp = arr[r];
            arr[r] = arr[c];
            arr[c] = temp;
            return sortBubble(arr,r,c+1);
        } else {
            return sortBubble(arr,r,c+1);
        }

    }


}
