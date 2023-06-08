package Math;

public class MathNum {
    public static void main(String[] args) {
//        System.out.println(PrimeCheck(121));
        int n =40;
        boolean [] PrimeSieve = new boolean[n+1];
        PrimeCheckSieve(n,PrimeSieve);
    }

    static void PrimeCheckSieve(int n,boolean[] arr){
                for (int i = 2; i*i <= n; i++) {
                    if(!arr[i]){

                        for (int j = i*2; j <= n; j+=i) {
                           arr[j] = true;
                        }
                    }
            }

        for (int i = 2; i <= n; i++) {
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }
    }

//    static boolean PrimeCheck(int n) {
//        if (n < 2) {
//            return false;
//        }
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }



}
