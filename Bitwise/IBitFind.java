package Bitwise;

// mask is 0003000
// In this we have to find ith bit, in number n
// mask with n-1 zeros. use left shift from lsb.

public class IBitFind {
    public static void main(String[] args) {
      int ith = 4;
      int num = 17;
     bitPositionfind(ith,num);
    }

    static void bitPositionfind(int p,int n){
        int mask = 1<<(p-1);
        int ans = n&mask;
        ans = ans>>(p-1);
        System.out.println("ans : "+ans);
    }
}
