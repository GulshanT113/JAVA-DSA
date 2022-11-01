import java.util.*;
public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int[][] input2D(){
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
    public static void print2D(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] matrixMul(int[][] arr, int[][] arr1){
        int a = arr.length, b = arr[0].length;
        int n = arr1.length, m = arr1[0].length;
        if(b != n)
        return null;
        int[][] ans = new int[a][m];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                int res = 0;
                for(int k = 0; k < a; k++){
                    res = arr[i][k]*arr1[k][j];
                }
                ans[i][j] = res;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] arr = input2D();
        int[][] arr1 = input2D();
        int[][] ans = matrixMul(arr, arr1);
        if(ans != null)
        print2D(ans);
        else
        System.out.println("error : your first arr column and second arr row not same pls entered both are same.");
    }
}