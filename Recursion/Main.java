class Main {
    public static void main(String[] args) {
//        System.out.println("hello");
//        System.out.println(fibo(3));
        int n = 20;
        nump(n);
        System.out.println(n+" o");
    }

    static int fibo(int n){
//        base condition
        if(n<2) {
            return n;
        }

          return fibo(n-1) + fibo(n-2);

    }
    static void nump(int n){
        n = n +10;
        System.out.println(n);
    }
}
