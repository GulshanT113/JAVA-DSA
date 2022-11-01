import java.util.*;
public class Main{
    public static int[][] matrix(int n){
        int[][] mat = new int[n][n];
        int r = 0, c = 0;
        int val = 1;
        while(c < n){
            r = 0;
            int copycol = c;
            while(r < n && copycol < n){
                mat[r][copycol] = val;
                val++;
                r++;
                copycol++;
            }
            c++;
        }
        // r = 1; c = 1;
        // while(r < mat.length){
        //     c = 1;
        //     int copyrow = r;
        //     while(copyrow < mat.length && c < mat.length){
        //         mat[copyrow][c] = val;
        //         val++;
        //         copyrow++;
        //         c++;
        //     }
        //     r++;
        // }
        return mat;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] ans = matrix(n);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++)
            System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }
}
