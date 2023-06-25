package Math;

public class NAndPArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-1,-2,-3};
        int[] ans = new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]<0){
               ans[k] = arr[i];
               k++;
           }
           else{
               ans[k++] = arr[i];
           }
        }

        for (int ele : ans ) {
            System.out.print(ele+" ");
        }
    }
}
