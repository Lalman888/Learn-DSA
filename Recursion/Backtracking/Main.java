package Recursion.Backtracking;

//Maze problems

public class Main {
    public static void main(String[] args) {
//     int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println("path length : "+countpaths(3,7));
//        pathSeq("",3,3);
//        pathSeqDiagonal("",3,3);
//        boolean[][] board = {
//                {true, true, true},
//                {true, false, true},
//                {true, true, true}
//        };
        boolean[][] boar2 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        pathSeqObstacle("", board, 0, 0);
        pathSeqObstacleAllPaths("",boar2,0,0);
    }

    private static void pathSeqObstacleAllPaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        maze[r][c]= false;
        if (r < maze.length - 1) {
            pathSeqObstacleAllPaths(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathSeqObstacleAllPaths(p + 'R', maze, r, c + 1);
        }

        if(r>0){
            pathSeqObstacleAllPaths(p+'U',maze,r-1,c);
        }
        if(c>0){
            pathSeqObstacleAllPaths(p+'L',maze,r,c-1);
        }

//        this is the line where the function will be over.

        maze[r][c] = true;
    }

    private static void pathSeqObstacle(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathSeqObstacle(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathSeqObstacle(p + 'R', maze, r, c + 1);
        }
    }

    private static void pathSeqDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            pathSeqDiagonal(p + 'D', r - 1, c);
        }
        if (c > 1) {
            pathSeqDiagonal(p + 'R', r, c - 1);
        }
        if (r > 1 && c > 1) {
            pathSeqDiagonal(p + 'X', r - 1, c - 1);
        }
    }

    private static void pathSeq(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            pathSeq(p + 'D', r - 1, c);
        }
        if (c > 1) {
            pathSeq(p + 'R', r, c - 1);
        }
    }

    static int countpaths(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = countpaths(row - 1, col);
        int right = countpaths(row, col - 1);
        return left + right;
    }
}
