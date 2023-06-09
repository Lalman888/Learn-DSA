package Math;

public class MathNum {
    public static void main(String[] args) {
//        System.out.println(PrimeCheck(121));
//        int n =40;
//        boolean [] PrimeSieve = new boolean[n+1];
//        PrimeCheckSieve(n,PrimeSieve);
        System.out.println(SquareRoot(40,3)+" n");
    }


//    time O(log(n))
    static double SquareRoot(int num,int pre){
        int s =0;
        int end = num;

        double root = 0.0;
        while(s<=end){
            int m = s+(end-s)/2;
            if(m*m == num){
                return m;
            }
            if(m*m>num){
                end = m -1;
            }
            else {
                s = m+1;
            }
        }
        double inc = 0.1;

        for (int i = 1; i <= pre; i++) {
//            System.out.println("root "+i+" "+root);

             while (root*root <=num){
                 root+=inc;
             }
             root-=inc;
             inc*=0.1;
        }

        System.out.println(root);

        return root;
    }


//    static void PrimeCheckSieve(int n,boolean[] arr){
//                for (int i = 2; i*i <= n; i++) {
//                    if(!arr[i]){
//
//                        for (int j = i*2; j <= n; j+=i) {
//                           arr[j] = true;
//                        }
//                    }
//            }
//
//        for (int i = 2; i <= n; i++) {
//            if(!arr[i]){
//                System.out.print(i+" ");
//            }
//        }
//    }

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
