package Recursion.Strings;

import java.util.ArrayList;

public class Subsquence {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String str = "abc";
        sequence("",str);
        System.out.println(list);
    }

    private static void sequence(String p,String up) {
        if(up.isEmpty()){
           if(!p.isEmpty()){
               list.add(p);
           }
            return;
        }

        sequence(p+up.charAt(0),up.substring(1));
        sequence(p,up.substring(1));
    }
}
