import java.util.*;
public class Main{
    public static int[][] matrix(int n){
        int[][] arr = new int[n][n];
        int x = 1;
        int row = 0, clm = 0;
        while(clm < n){
            row = 0;
            int dummy = clm;
            while(row < n && dummy < n){
                arr[row][dummy] = x;
                x++;
                dummy++;
                row++;
            }
            clm++;
        }
        row = 1; clm = n-1;
        while(row < n){
            clm = 0;
            int dummy = row;
            while(clm < n && dummy < n){
                arr[dummy][clm] = x;
                x++;
                dummy++;
                clm++;
            }
            row++;
        }
        return arr;
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
