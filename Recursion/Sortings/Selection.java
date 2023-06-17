package Recursion.Sortings;

public class Selection {
    public static void main(String[] args) {
     int[] arr = {3,4,7,6,2,1};
        for (int ele:  arr) {
            System.out.print(ele);
        }
        System.out.println();
//     sortArray(arr,0);
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
           if(max<arr[col]){
               max = col;
               sortRec(arr,max,row,col+1);

               if(max != row){
                   int temp = arr[row];
                   arr[row] = arr[max];
                   arr[max] = temp;
               }
           }
       } else {
           sortRec(arr,0,row+1,0);
       }


    }

    public static void sortArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return;
        }

        int minIndex = index;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        if (minIndex != index) {
            int temp = arr[minIndex];
            arr[minIndex] = arr[index];
            arr[index] = temp;
        }

        sortArray(arr, index + 1);
    }


}
