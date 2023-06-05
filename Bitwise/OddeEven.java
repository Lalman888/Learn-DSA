package Bitwise;

import java.util.Scanner;

public class OddeEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int inp = sc.nextInt();
        if(EvenOddNum(inp)){
            System.out.println("Even : "+inp);
        }
        else {
            System.out.println("Odd : "+inp);
        }
    }
    static boolean EvenOddNum (int n){
        return (n&1) == 0;
    }
}
