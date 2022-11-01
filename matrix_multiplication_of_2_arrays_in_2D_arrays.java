import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[][] input_2D(){
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
    public static void print_2D(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] matrix_mul(int[][] a, int[][] b){
        int n = a.length, m = a[0].length;
        int p = b.length, q = b[0].length;
        if(m != p){
            return null;
        }
        int[][] ans = new int[n][q];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                int res = 0;
                for(int k = 0; k < m; k++){
                    res += a[i][k] * b[k][j];
                }
                ans[i][j] = res;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] a = input_2D();
        int[][] b = input_2D();
        int[][] ans = matrix_mul(a, b);
        if(ans != null){
            print_2D(ans);
        }
        else{
            System.out.println(-1);
        }
    }
}