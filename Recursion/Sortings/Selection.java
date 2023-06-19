package Recursion.Sortings;

public class Selection {
    public static void main(String[] args) {
//     int[] arr = {3,4,7,6,2,1};
        int[] arr = {2,4,5,6,0,1,0,2};
        for (int ele:  arr) {
            System.out.print(ele);
        }
        System.out.println();
        sortRec(arr,0,arr.length-1,0);
        for (int ele:  arr) {
            System.out.print(ele);
        }
    }
    private static void sortRec(int[] arr, int max, int row, int col) {
        if(row == 0){
            return;
        }
       if(row>col){
           if(arr[max]<arr[col]){
               max = col;
               sortRec(arr,max,row,col+1);
           } else {
               sortRec(arr,max,row,col+1);
           }

       } else {
           if(max != row && arr[max]>arr[row]){
               int temp = arr[row];
               arr[row] = arr[max];
               arr[max] = temp;
           }
           sortRec(arr,0,row-1,0);
       }
    }
}
