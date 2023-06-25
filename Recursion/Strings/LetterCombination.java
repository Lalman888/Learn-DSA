package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
//      pad("","12");
//        System.out.println(list);
        System.out.println(padA("","89"));
    }

    static  ArrayList<String> padA(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
//            list.add(p);
            return l;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> all = new ArrayList<>();
        int start = (digit-2)*3;
        int end = (digit-1)*3;
        if(digit== 7){
            end = end+1;
        }
        if(digit == 8){
            start= start+1;
            end = end +1;
        }
        if(digit == 9){
            start = start+1;
            end = end+2;
        }
        for (int i = start; i < end; i++) {
            char charToadd = (char) ('a'+i);
            all.addAll(padA(p+charToadd,up.substring(1)));

        }
        return all;

    }

    static void pad(String p,String up){
        if(up.isEmpty()){
            list.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char charToadd = (char) ('a'+i);
            pad(p+charToadd,up.substring(1));
        }

    }
}
