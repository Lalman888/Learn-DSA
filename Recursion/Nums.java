package Recursion;

public class Nums {
    public static void main(String[] args) {
        int n = 5;
//        NtoOne(n);
//        System.out.println(facto(n));
//        System.out.println(SumofDigits(222,0));
//        System.out.println(ProductofDigits(222));
//        System.out.println(RevNums(1824,0));
//        System.out.println(PalindromeCheck(122));
//        System.out.println(CountZero(100000,0));
        System.out.println(countStep(14,0));
    }

    public static int countStep(int n,int c){
        if(n == 0){
            return c;
        }
        if(n%2 == 0){
            n = n/2 ;
            c++;
            return countStep(n,c);
        }
        if(n%2 != 0){
            c++;
            n = n-1;
            return countStep(n,c);
        }
        return c;
    }

    private static int CountZero(int n,int count) {
        if(n == 0){
            return count;
        }
        int temp = n%10;
        if(temp == 0){
            count++;
        }
        n= n/10;

        return CountZero(n,count);

    }

    private static boolean PalindromeCheck(int i) {
        if(i==RevNums(i,0)){
            return true;
        }
        return false;

    }


    private static int RevNums(int n,int r) {
        if(n==0){
            return r;
        }
        r = r+ n%10;
        n/=10;
        if(n !=0){
            r = r*10;
        }
        return RevNums(n,r);
    }

    private static int SumofDigits(int i,int sum) {
        if(i == 0){
            return sum;
        }
        sum = sum + i % 10;
        return SumofDigits(i/10,sum);
    }

    static int ProductofDigits(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * ProductofDigits(n/10);
    }

    private static int facto(int n) {
        if(n==1){
            return 1;
        }
        return n+facto(n-1);
    }

    private static void NtoOne(int n) {
        if(n==0){
            return;
        }
//        System.out.println(n);
        NtoOne(n-1);
        System.out.println(n);
        return ;
    }
}
