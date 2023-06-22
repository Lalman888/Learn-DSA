package Recursion.permutations;

public class Main {
    public static void main(String[] args) {
   permut("","abc");
    }

    static void permut(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i < p.length()+1; i++) {
           String first = p.substring(0,i);
           String second = p.substring(i,p.length());
           permut(first+ch+second,up.substring(1));
        }
    }

}
