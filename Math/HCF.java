package Math;

public class HCF {
    public static void main(String[] args) {
//        System.out.println("hcf is "+gcdecd(93920,2208));
//        System.out.println("hcf is "+gcd(39,46));
        System.out.println("lcm is : "+lcm(2,4));
    }

    public static int lcm(int p,int q){
        int lcm = (p*q)/gcd(p,q);
        return lcm;
    }

    public static int gcd(int x,int y){
        if(x==0){
            return x;
        }
        if(y==0){
            return y;
        }
        if(x==y){
            return x;
        }

        if(x>y){
           return gcd(x-y,y);
        }

        return gcd(y-x,x);
    }

    public static int gcdecd(int a,int b){
        if(a==0){
            return b;
        }
        return gcdecd(b%a,a);
    }
}
