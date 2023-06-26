package Recursion.Backtracking;

import java.util.Arrays;

public class PrintMatrix {
    public static void main(String[] args) {
        boolean[][] boar2 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] arr = new int[boar2.length][boar2[0].length];

        pathSeqAllPaths("",boar2,arr,0,0,1);
    }

    private static void pathSeqAllPaths(String p, boolean[][] maze,int[][] ans, int r, int c,int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            ans[r][c] = step;
            for (int[] row : ans){
                System.out.println(Arrays.toString(row));
            }
//            System.out.println(Arrays.deepToString(ans));
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        maze[r][c]= false;
        ans[r][c] = step;

        if (r < maze.length - 1) {
            pathSeqAllPaths(p + 'D', maze,ans, r + 1, c,step+1);
        }
        if (c < maze[0].length - 1) {
            pathSeqAllPaths(p + 'R', maze,ans, r, c + 1,step+1);
        }

        if(r>0){
            pathSeqAllPaths(p+'U',maze,ans,r-1,c,step+1);
        }
        if(c>0){
            pathSeqAllPaths(p+'L',maze,ans,r,c-1,step+1);
        }

//        this is the line where the function will be over.

        maze[r][c] = true;
        ans[r][c] = 0;
    }
}
