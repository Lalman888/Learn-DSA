package Bitwise;

public class UniqueNumberInArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,2,4,5,5,87,3};
        BruteForce(arr); //n^2 time
//        bitApproach(arr); //n time  xor with every number will get unique a^a = 0;
    }
    static void BruteForce(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if(a[i] == a[j]){
                    a[i] = 0;
                    a[j] =0;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                System.out.println("unique number is : "+a[i]);
            }
        }
    }

    static void bitApproach(int[] a){
        int ans = 0;
        for (int n : a) {
          ans ^= n;
        }
        System.out.println(ans+ " : answer");
    }
}
