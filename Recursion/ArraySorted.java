package Recursion;

import java.util.ArrayList;

public class ArraySorted {
    public static void main(String[] args) {
//        ArraySorted a = new ArraySorted(); if we don't say static then a and b both have different lists.
//        ArraySorted b = new ArraySorted();
        ArraySorted ab = new ArraySorted();
        int[] arr = {1,3,3,3,5,6,7,8};
//        System.out.println(checkSorted(arr,0));
//        for (int e: arr) {
//            System.out.print(e+" ");
//        }
//        System.out.println(ArraylistAns(arr,0,3).toString());
//        System.out.println("static check : "+ab.list);
//        System.out.println(list.toString());
//        printNums(6);
        System.out.println(insideFun(arr,3,0).toString());
    }
   static ArrayList<Integer> list = new ArrayList<>();
    private static ArrayList<Integer> ArraylistAns(int[] a,int i,int t) {
        if(i > a.length-1){
            return list;
        }
        if(a[i] == t){
            list.add(i);
        }
        return ArraylistAns(a,i+1,t);
    }

    private static void printNums(int i) {
        if(i==0){
            return;
        }
//        System.out.println(i);
        printNums(i-1);
//        System.out.println(i);
    }

    private static boolean checkSorted(int[] a, int i) {
        if(i == a.length -1){
            return true;
        }
        if(a[i] > a[i+1]){
            return false;
        }
        return checkSorted(a,i+1);
    }

//    create list inside function which will take o(n) space complexity

     private static ArrayList<Integer> insideFun(int[] a,int t,int i){
        ArrayList<Integer> list = new ArrayList<>();

         if(i == a.length -1){
             return list;
         }
         if(a[i] == t){
             list.add(i);
         }

         ArrayList<Integer> ansFromCall = insideFun(a,t,i+1);
         list.addAll(ansFromCall);
         return list;
     }

}
