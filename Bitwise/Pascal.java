package Bitwise;

public class Pascal {
    public static void main(String[] args) {
        int n = 3;
        int sum = 1<<(n-1);
//        System.out.println("sum is : "+sum);
//        TwoPower(16);
        System.out.println("number of set bits is : "+SetBitsCount(8));
    }

    static void TwoPower(int n){
        if(n>1){
            int c = n-1;
            if((n&c) == 0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        else {
            System.out.println("yes ");
        }
    }

//    find number of set bits

    static int SetBitsCount(int n){
        int count = 0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n = n >>1;
        }
        return count;

    }
}
