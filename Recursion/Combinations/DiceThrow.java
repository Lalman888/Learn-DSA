package Recursion.Combinations;

public class DiceThrow {
    public static void main(String[] args) {
     dice("",4);
        System.out.println();
        System.out.println(diceCount("",4));
    }

    static int diceCount(String p,int target){
        if(target == 0){
            return 1;
        }
        int count = 0;
        for (int i = 1; i <=6 && i<= target ; i++) {
            count = count + diceCount(p+i,target-i);
        }
        return count;
    }
    static void dice(String p,int target){
        if(target == 0){
            System.out.print(p+" ");
            return;
        }

        for (int i = 1; i <=6 && i<= target ; i++) {
            dice(p+i,target-i);
        }
    }
}
