package Recursion;

public class PrintNumber {
    public static void main(String[] args) {
        num(5);
    }

     static void num(int i) {
        if(i>=1){
            System.out.println(i);
            num(i-1);
        }

    }
}
