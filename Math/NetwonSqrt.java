package Math;

public class NetwonSqrt {
    public static void main(String[] args) {
      double num = 4;
        System.out.println(sqrt(num));
    }

    static double sqrt(double n){
        double x = n;
        double root = 0;
        while (true){
            root = 0.5*(x+(n/x));

            if(Math.abs(root - x) < 0.00000001){
//                return root;
                break;
            }
            x = root;
        }
        return root;
    }
}
