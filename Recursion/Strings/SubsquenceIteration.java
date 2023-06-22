package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class SubsquenceIteration {
    public static void main(String[] args) {
     int[] array = {1,2,3};
        System.out.println(subset(array));
    }
    static List<List<Integer>> subset (int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int number :  arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
//                to create copy of previous list elements in new list outer.get(i)
                List<Integer> internal = new ArrayList<>(outer.get(i));
//                add number in list
                internal.add(number);
                outer.add(internal);
            }

        }

        return outer;
    }
}
